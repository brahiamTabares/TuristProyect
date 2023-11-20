package bases.beans;

import bases.repositorio.AbstractRepositorio;
import bases.repositorio.AutoRepositorio;
import bases.repositorio.EstadoAutoRepositorio;
import bases.repositorio.PaqTuristicoRepositorio;
import entidades.Auto;
import entidades.EstadoAuto;
import entidades.PaqTuristico;
import jakarta.annotation.PostConstruct;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ViewScoped
@Named
public class PaqTuristicoBean extends GenericBean<PaqTuristico> {

    @Inject
    private PaqTuristicoRepositorio repositorio;

    @PostConstruct
    public void init(){
        records = repositorio.get();

    }

    @Override
    protected PaqTuristico newRecord() {
        var nuevo = new PaqTuristico();
        return nuevo;
    }

    @Override
    protected AbstractRepositorio<PaqTuristico> getRepositorio() {
        return repositorio;
    }

    public void validate(FacesContext facesContext, UIComponent component, java.lang.Object object){
        validateUnique(facesContext, component, object, record -> record.getCodPaqTur().equals(object.toString()) );
    }

}