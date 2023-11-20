package bases.beans;
import bases.repositorio.AbstractRepositorio;
import bases.repositorio.TipoAutoRepositorio;
import bases.repositorio.TipoPaqRepositorio;
import entidades.TipoAuto;
import entidades.TipoPaq;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ViewScoped
@Named
public class TipoPaqBean extends GenericBean<TipoPaq> {

    @Inject
    private TipoPaqRepositorio repositorio;


    @PostConstruct
    public void init(){
        records = repositorio.get();
        // Realiza cualquier inicialización necesaria
        // ...
    }
    protected TipoPaq newRecord() {
        return new TipoPaq(); // Puedes establecer valores predeterminados si es necesario
    }

    @Override
    protected AbstractRepositorio<TipoPaq> getRepositorio() {
        return repositorio;
    }


}
