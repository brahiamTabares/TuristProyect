package bases.beans;
import bases.repositorio.AbstractRepositorio;
import bases.repositorio.EstadoHabRepositorio;
import bases.repositorio.TipoHabRepositorio;
import entidades.EstadoHab;
import entidades.TipoHab;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ViewScoped
@Named
public class EstadoHabBean extends GenericBean<EstadoHab> {

    @Inject
    private EstadoHabRepositorio repositorio;


    @PostConstruct
    public void init(){
        records = repositorio.get();
        // Realiza cualquier inicialización necesaria
        // ...
    }
    protected EstadoHab newRecord() {
        return new EstadoHab(); // Puedes establecer valores predeterminados si es necesario
    }

    @Override
    protected AbstractRepositorio<EstadoHab> getRepositorio() {

        return repositorio;
    }


}
