
package bases.beans;
import bases.beans.GenericBean;
import bases.repositorio.*;
import entidades.Administrador;
import entidades.EstadoA;
import entidades.Hotel;
import entidades.TipoHotel;
import jakarta.annotation.PostConstruct;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ViewScoped
@Named
public class HotelBean extends GenericBean<Hotel> {

    @Inject
    private HotelRepositorio repositorio;
    @PostConstruct
    public void init(){
        records = repositorio.get();
        // Realiza cualquier inicialización necesaria
        // ...
    }
    @Override
    protected Hotel newRecord() {
        return new Hotel();
    }

    @Override
    protected AbstractRepositorio<Hotel> getRepositorio() {
        return repositorio;
    }

    public void validate(FacesContext facesContext, UIComponent component, java.lang.Object object){
        validateUnique(facesContext, component, object, record -> record.getCodHotel().equals(object.toString()) );
    }
}