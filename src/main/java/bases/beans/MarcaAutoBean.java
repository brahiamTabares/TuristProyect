package bases.beans;
import bases.repositorio.AbstractRepositorio;
import bases.repositorio.MarcaAutoRepositorio;
import bases.repositorio.TipoAutoRepositorio;
import entidades.MarcaAuto;
import entidades.TipoAuto;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ViewScoped
@Named
public class MarcaAutoBean extends GenericBean<MarcaAuto> {

    @Inject
    private MarcaAutoRepositorio repositorio;


    @PostConstruct
    public void init(){
        records = repositorio.get();
        // Realiza cualquier inicialización necesaria
        // ...
    }
    protected MarcaAuto newRecord() {
        return new MarcaAuto(); // Puedes establecer valores predeterminados si es necesario
    }

    @Override
    protected AbstractRepositorio<MarcaAuto> getRepositorio() {
        return repositorio;
    }


}
