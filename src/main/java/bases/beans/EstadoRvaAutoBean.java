package bases.beans;
import bases.repositorio.AbstractRepositorio;
import bases.repositorio.EstadoRvaAutoRepositorio;
import bases.repositorio.EstadoRvaPaqRepositorio;
import entidades.EstadoRvaAuto;
import entidades.EstadoRvaPaq;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ViewScoped
@Named
public class EstadoRvaAutoBean extends GenericBean<EstadoRvaAuto> {

    @Inject
    private EstadoRvaAutoRepositorio repositorio;


    @PostConstruct
    public void init(){
        records = repositorio.get();
        // Realiza cualquier inicialización necesaria
        // ...
    }
    protected EstadoRvaAuto newRecord() {
        return new EstadoRvaAuto(); // Puedes establecer valores predeterminados si es necesario
    }

    @Override
    protected AbstractRepositorio<EstadoRvaAuto> getRepositorio() {

        return repositorio;
    }

}
