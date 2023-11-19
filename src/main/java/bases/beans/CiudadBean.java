package bases.beans;

import bases.repositorio.*;
import entidades.Auto;
import entidades.CiudadEnt;
import entidades.EstadoAuto;
import entidades.TipoArt;
import jakarta.annotation.PostConstruct;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
@ViewScoped
@Named
public class CiudadBean extends GenericBean<CiudadEnt>{
    @Inject
    private CiudadRepositorio repositorio;

    @PostConstruct
    public void init(){
        records = repositorio.get();
        // Realiza cualquier inicialización necesaria
        // ...
    }
    protected CiudadEnt newRecord() {
            return new CiudadEnt(); // Puedes establecer valores predeterminados si es necesario
    }

    @Override
    protected AbstractRepositorio<CiudadEnt> getRepositorio() {
        return repositorio;
    }

}

