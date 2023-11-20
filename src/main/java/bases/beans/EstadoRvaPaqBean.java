package bases.beans;
import bases.repositorio.AbstractRepositorio;
import bases.repositorio.EstadoHabRepositorio;
import bases.repositorio.EstadoRvaPaqRepositorio;
import entidades.EstadoHab;
import entidades.EstadoRvaPaq;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ViewScoped
@Named
public class EstadoRvaPaqBean extends GenericBean<EstadoRvaPaq> {

    @Inject
    private EstadoRvaPaqRepositorio repositorio;


    @PostConstruct
    public void init(){
        records = repositorio.get();
        // Realiza cualquier inicialización necesaria
        // ...
    }
    protected EstadoRvaPaq newRecord() {
        return new EstadoRvaPaq(); // Puedes establecer valores predeterminados si es necesario
    }

    @Override
    protected AbstractRepositorio<EstadoRvaPaq> getRepositorio() {

        return repositorio;
    }


}
