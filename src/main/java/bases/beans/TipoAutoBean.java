package bases.beans;
import bases.repositorio.AbstractRepositorio;
import bases.repositorio.AutoRepositorio;
import bases.repositorio.TipoAutoRepositorio;
import entidades.Auto;
import entidades.TipoAuto;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.List;

@ViewScoped
@Named
public class TipoAutoBean extends GenericBean<TipoAuto> {

    @Inject
    private TipoAutoRepositorio repositorio;


    @PostConstruct
    public void init(){
        records = repositorio.get();
        // Realiza cualquier inicialización necesaria
        // ...
    }
    protected TipoAuto newRecord() {
        return new TipoAuto(); // Puedes establecer valores predeterminados si es necesario
    }

    @Override
    protected AbstractRepositorio<TipoAuto> getRepositorio() {
        return repositorio;
    }


}
