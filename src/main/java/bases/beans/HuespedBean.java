
package bases.beans;


import bases.repositorio.AbstractRepositorio;
import bases.repositorio.HuespedRepositorio;
import entidades.Huesped;
import jakarta.annotation.PostConstruct;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ViewScoped
@Named
public class HuespedBean extends GenericBean<Huesped> {

    @Inject
    private HuespedRepositorio repositorio;


    @PostConstruct
    public void init(){
        records = repositorio.get();
    }

    @Override
    protected Huesped newRecord() {
        var nuevo = new Huesped();
      return  nuevo;
    }

    @Override
    protected AbstractRepositorio<Huesped> getRepositorio() {
        return repositorio;
    }

    public void validate(FacesContext facesContext, UIComponent component, java.lang.Object object){
        validateUnique(facesContext, component, object, record -> record.getEmail().equals(object.toString()) );
    }
}
