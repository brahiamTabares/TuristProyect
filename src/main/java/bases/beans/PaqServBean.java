package bases.beans;

import bases.repositorio.*;
import entidades.Auto;
import entidades.EstadoAuto;
import entidades.PaqServ;
import entidades.PaqTuristico;
import jakarta.annotation.PostConstruct;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ViewScoped
@Named
public class PaqServBean extends GenericBean<PaqServ> {

    @Inject
    private PaqSerRepositorio repositorio;

    @PostConstruct
    public void init(){
        records = repositorio.get();

    }

    @Override
    protected PaqServ newRecord() {
        var nuevo = new PaqServ();
        return nuevo;
    }

    @Override
    protected AbstractRepositorio<PaqServ> getRepositorio() {
        return repositorio;
    }

    public void validate(FacesContext facesContext, UIComponent component, java.lang.Object object){
        validateUnique(facesContext, component, object, record -> record.getCodPserv().equals(object.toString()) );
    }

}
