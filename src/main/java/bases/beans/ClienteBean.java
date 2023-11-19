package bases.beans;
import bases.repositorio.*;
import entidades.Administrador;
import entidades.Cliente;
import entidades.EstadoA;
import entidades.Estadocliente;
import jakarta.annotation.PostConstruct;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@ViewScoped
@Named
@Getter
@Setter
public class ClienteBean extends GenericBean<Cliente> {

    @Inject
    private ClienteRepositorio repositorio;
    @Inject
    private EstadoClienteRepositorio estadoClienteRepositorio;
    private Estadocliente defaultEstado;


    @PostConstruct
    public void init(){
        records = repositorio.get();
        defaultEstado = estadoClienteRepositorio.find("ECL1").orElse(null);
        record.setEstadoCliente(defaultEstado);
    }

    @Override
    protected Cliente newRecord() {
        var nuevo = new Cliente();
        nuevo.setEstadoCliente(defaultEstado);
        return nuevo;
    }

    @Override
    protected AbstractRepositorio<Cliente> getRepositorio() {
        return repositorio;
    }

    public void validate(FacesContext facesContext, UIComponent component, java.lang.Object object){
        validateUnique(facesContext, component, object, record -> record.getCedula().equals(object.toString()) );
    }
}
