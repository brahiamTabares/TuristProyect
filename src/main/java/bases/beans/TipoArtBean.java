package bases.beans;

import bases.repositorio.AbstractRepositorio;
import bases.repositorio.EstadoArtRepositorio;
import bases.repositorio.TipoArtRepositorio;
import bases.repositorio.TipoAutoRepositorio;
import entidades.EstadoArt;
import entidades.TipoArt;
import entidades.TipoAuto;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ViewScoped
@Named
public class TipoArtBean extends GenericBean<TipoArt>{
    @Inject
    private TipoArtRepositorio repositorio;

    @PostConstruct
    public void init(){
        records = repositorio.get();
        // Realiza cualquier inicialización necesaria
        // ...
    }
    protected TipoArt newRecord() {
        return new TipoArt(); // Puedes establecer valores predeterminados si es necesario
    }

    @Override
    protected AbstractRepositorio<TipoArt> getRepositorio() {
        return repositorio;
    }

}
