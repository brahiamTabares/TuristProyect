package bases.beans;
import bases.repositorio.AbstractRepositorio;
import bases.repositorio.TipoAutoRepositorio;
import bases.repositorio.TipoHabRepositorio;
import entidades.TipoAuto;
import entidades.TipoHab;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ViewScoped
@Named
public class TipoHabBean extends GenericBean<TipoHab> {

    @Inject
    private TipoHabRepositorio repositorio;


    @PostConstruct
    public void init(){
        records = repositorio.get();
        // Realiza cualquier inicialización necesaria
        // ...
    }
    protected TipoHab newRecord() {
        return new TipoHab(); // Puedes establecer valores predeterminados si es necesario
    }

    @Override
    protected AbstractRepositorio<TipoHab> getRepositorio() {
        return repositorio;
    }


}
