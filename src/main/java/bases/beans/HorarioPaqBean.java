
package bases.beans;


import bases.repositorio.AbstractRepositorio;
import bases.repositorio.EstadoHabRepositorio;
import bases.repositorio.HabitacionRepositorio;
import bases.repositorio.HorarioPaqRepositorio;
import entidades.EstadoHab;
import entidades.Habitacion;
import entidades.HorarioPaq;
import jakarta.annotation.PostConstruct;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ViewScoped
@Named
public class HorarioPaqBean extends GenericBean<HorarioPaq> {

    @Inject
    private HorarioPaqRepositorio repositorio;

    @PostConstruct
    public void init() {
        records = repositorio.get();
    }

    @Override
    protected HorarioPaq newRecord() {
        var nuevo = new HorarioPaq();
        return nuevo;
    }

    @Override
    protected AbstractRepositorio<HorarioPaq> getRepositorio() {
        return repositorio;
    }

    public void validate(FacesContext facesContext, UIComponent component, Object object) {
        validateUnique(facesContext, component, object, record -> record.getCodigo().equals(object.toString()));
    }
}
