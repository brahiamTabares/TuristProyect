
package bases.beans;


import bases.repositorio.*;

import entidades.EstadoHab;
import entidades.Habitacion;
import jakarta.annotation.PostConstruct;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ViewScoped
@Named
public class HabitacionBean extends GenericBean<Habitacion> {

    @Inject
    private HabitacionRepositorio repositorio;
    @Inject
    private EstadoHabRepositorio estadoHabRepositorio;
    private EstadoHab defaultEstado;

    @PostConstruct
    public void init() {
        records = repositorio.get();
        defaultEstado = estadoHabRepositorio.find("EH001").orElse(null);
        record.setEstadoHabCodEh(defaultEstado);
    }

    @Override
    protected Habitacion newRecord() {
        var nuevo = new Habitacion();
        nuevo.setEstadoHabCodEh(defaultEstado);
        return nuevo;
    }

    @Override
    protected AbstractRepositorio<Habitacion> getRepositorio() {
        return repositorio;
    }

    public void validate(FacesContext facesContext, UIComponent component, java.lang.Object object) {
        validateUnique(facesContext, component, object, record -> record.getId().equals(object.toString()));
    }
}
