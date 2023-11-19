package bases.beans;
import bases.repositorio.AbstractRepositorio;
import bases.repositorio.GamaAutoRepositorio;
import bases.repositorio.TipoAutoRepositorio;
import entidades.GamaAuto;
import entidades.TipoAuto;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ViewScoped
@Named
public class GamaAutoBean extends GenericBean<GamaAuto> {

    @Inject
    private GamaAutoRepositorio repositorio;


    @PostConstruct
    public void init(){
        records = repositorio.get();
        // Realiza cualquier inicialización necesaria
        // ...
    }
    protected GamaAuto newRecord() {
        return new GamaAuto(); // Puedes establecer valores predeterminados si es necesario
    }

    @Override
    protected AbstractRepositorio<GamaAuto> getRepositorio() {
        return repositorio;
    }


}
