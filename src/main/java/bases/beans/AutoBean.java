package bases.beans;

import bases.repositorio.AbstractRepositorio;
import bases.repositorio.AutoRepositorio;
import bases.repositorio.EstadoAutoRepositorio;
import entidades.Auto;
import entidades.EstadoAuto;
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
    private EstadoAutoRepositorio estadoAutoRepositorio;
    private EstadoAuto defaultEstado;

    @PostConstruct
    public void init(){
        records = repositorio.get();
        defaultEstado = estadoAutoRepositorio.find("EA002").orElse(null);
        record.setEstadoAuto(defaultEstado);
    }

    @Override
    protected Auto newRecord() {
        var nuevo = new Auto();
        nuevo.setEstadoAuto(defaultEstado);
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