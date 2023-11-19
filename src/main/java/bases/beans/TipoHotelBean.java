package bases.beans;

import bases.repositorio.AbstractRepositorio;
import bases.repositorio.TipoAutoRepositorio;
import bases.repositorio.TipoHotelRepositorio;
import entidades.TipoArt;
import entidades.TipoAuto;
import entidades.TipoHotel;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ViewScoped
@Named
public class TipoHotelBean extends GenericBean<TipoHotel>{
    @Inject
    private TipoHotelRepositorio repositorio;


    @PostConstruct
    public void init(){
        records = repositorio.get();
        // Realiza cualquier inicialización necesaria
        // ...
    }
    protected TipoHotel newRecord() {
        return new TipoHotel(); // Puedes establecer valores predeterminados si es necesario
    }

    @Override
    protected AbstractRepositorio<TipoHotel> getRepositorio() {
        return repositorio;
    }

}
