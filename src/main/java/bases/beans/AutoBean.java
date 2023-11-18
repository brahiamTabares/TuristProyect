package bases.beans;


import bases.beans.GenericBean;
import bases.repositorio.AbstractRepositorio;
import bases.repositorio.AdministradorRepositorio;
import bases.repositorio.AutoRepositorio;
import bases.repositorio.EstadoARepositorio;
import entidades.Administrador;
import entidades.Auto;
import entidades.EstadoA;
import jakarta.annotation.PostConstruct;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ViewScoped
@Named
public class AutoBean extends GenericBean<Auto> {

    @Inject
    private AutoRepositorio repositorio;
    @Inject
    private EstadoARepositorio estadoARepositorio;
    private EstadoA defaultEstado;
    @PostConstruct
    public void init(){
        records = repositorio.get();
        defaultEstado = estadoARepositorio.find("EA001").orElse(null);
        record.setEstado(defaultEstado);
    }

    @Override
    protected Auto newRecord() {
        var nuevo = new Auto();
        nuevo.setEstado(defaultEstado);
        return nuevo;
    }

    @Override
    protected AbstractRepositorio<Auto> getRepositorio() {
        return repositorio;
    }

    public void validate(FacesContext facesContext, UIComponent component, java.lang.Object object){
        validateUnique(facesContext, component, object, record -> record.getCodAuto().equals(object.toString()) );
    }
}