package bases.beans;

import bases.repositorio.AbstractRepositorio;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.application.FacesMessage.Severity;
import jakarta.faces.component.UIComponent;
import jakarta.faces.component.UIInput;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.ValidatorException;
import jakarta.inject.Inject;
import org.primefaces.event.RowEditEvent;

import java.io.Serializable;
import java.util.Collection;
import java.util.function.Predicate;

public abstract class GenericBean<T> implements Serializable {
    @Inject
    private FacesContext facesContext;
    protected T record;

    protected Collection<T> records;
    public GenericBean() {
        this.record = newRecord();
    }

    public void onRowEdit(RowEditEvent<T> event) {
        T objeto = event.getObject();
        try {
            actualizar(objeto);
            mostrarMensajeGeneral("Operación exitosa");
        } catch (Exception e) {
            mostrarErrorGeneral(e.getMessage());
        }
    }

    /**
     * Permite registrar un nuevo registro en el sistema
     *
     */
    public void registrar() {
        try {
            getRepositorio().save(record);
            mostrarMensajeGeneral("Operación exitosa");
            records.add(record);
            record = newRecord();
        }catch (Throwable throwable){
            throwable.printStackTrace();
            mostrarErrorGeneral("Error inesperado del sistema");
        }
    }

    protected abstract T newRecord();

    /**
     * Permite actualizar un registro
     *
     * @param record Registro a eliminar
     */
    public void actualizar(T record) {
        try {
            getRepositorio().save(record);
            mostrarMensajeGeneral("Operación exitosa");
        }catch (Throwable throwable){
            throwable.printStackTrace();
            mostrarErrorGeneral("Error inesperado del sistema");
        }
    }

    /**
     * Permite eliminar un registro
     *
     * @param record Registro a eliminar
     */
    public void eliminar(T record) {
        try {
            getRepositorio().delete(record);
            mostrarMensajeGeneral("Operación exitosa");
            records.remove(record);
        }catch (Throwable throwable){
            throwable.printStackTrace();
            mostrarErrorGeneral("Error inesperado del sistema");
        }
    }

    public void onRowCancel(RowEditEvent<T> event) {
        mostrarMensajeGeneral("Operación cancelada");
    }

    /**
     * Permite obtener el servicio encargado de la gestión de los registros
     * @return el servicio encargado de la gestión de los registros
     */
    protected abstract AbstractRepositorio<T> getRepositorio();

    public T getRecord() {
        return record;
    }

    public void setRecord(T record) {
        this.record = record;
    }

    public Collection<T> getRecords() {
        return records;
    }

    public void setRecords(Collection<T> records) {
        this.records = records;
    }

    public void validateUnique(FacesContext facesContext, UIComponent component, Object object, Predicate<T> filter){
        boolean existe = records.stream().anyMatch( filter );
        Object oldValue = ((UIInput) component).getValue();
        if (existe && (oldValue == null || !oldValue.toString().equals(object.toString()))) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: Registro duplicado ", "Error: Registro duplicado");
            throw new ValidatorException(msg);
        }
    }


    protected void mostrarErrorGeneral(String mensaje) {
        mostrarErrorEspecifico(null, mensaje);
    }

    protected void mostrarErrorEspecifico(String idComponente, String mensaje) {
        mostrarMensaje(idComponente, mensaje, FacesMessage.SEVERITY_ERROR);
    }

    protected void mostrarAdvertenciaGeneral(String mensaje) {
        mostrarAdvertenciaEspecifico(null, mensaje);
    }

    protected void mostrarAdvertenciaEspecifico(String idComponente, String mensaje) {
        mostrarMensaje(idComponente, mensaje, FacesMessage.SEVERITY_WARN);
    }

    protected void mostrarMensajeGeneral(String mensaje) {
        mostrarMensajeEspecifico(null, mensaje);
    }

    protected void mostrarMensajeEspecifico(String idComponente, String mensaje) {
        mostrarMensaje(idComponente, mensaje, FacesMessage.SEVERITY_INFO);
    }

    protected void mostrarMensaje(String idComponente, String mensaje, Severity severidad) {
        FacesMessage facesMessage = new FacesMessage(severidad, mensaje, mensaje);
        getFacesContext().addMessage(idComponente, facesMessage);
    }

    protected FacesContext getFacesContext() {
        if( facesContext == null ){
            facesContext = FacesContext.getCurrentInstance();
        }
        return facesContext;
    }
}
