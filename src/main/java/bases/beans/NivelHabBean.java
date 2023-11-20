package bases.beans;
import bases.repositorio.AbstractRepositorio;
import bases.repositorio.NivelHabRepositorio;
import bases.repositorio.TipoHabRepositorio;
import entidades.NivelHabitacion;
import entidades.TipoHab;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ViewScoped
@Named
public class NivelHabBean extends GenericBean<NivelHabitacion> {

    @Inject
    private NivelHabRepositorio repositorio;


    @PostConstruct
    public void init(){
        records = repositorio.get();
        // Realiza cualquier inicialización necesaria
        // ...
    }
    protected NivelHabitacion newRecord() {
        return new NivelHabitacion(); // Puedes establecer valores predeterminados si es necesario
    }

    @Override
    protected AbstractRepositorio<NivelHabitacion> getRepositorio() {
        return repositorio;
    }


}
