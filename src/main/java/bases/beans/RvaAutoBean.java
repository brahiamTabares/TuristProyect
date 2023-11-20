package bases.beans;

import bases.repositorio.*;
import entidades.EstadoRvaAuto;
import entidades.Estadorvahosp;
import entidades.RvaAuto;
import entidades.RvaHosp;
import jakarta.annotation.PostConstruct;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ViewScoped
@Named
public class RvaAutoBean extends GenericBean<RvaAuto> {

    @Inject
    private RvaAutRepositorio repositorio;
    @Inject
    private EstadoRvaAutoRepositorio  estadoRvaAutoRepositorio;

    private EstadoRvaAuto defaultEstadoRvaAuto;
    @PostConstruct
    public void init(){
        records = repositorio.get();
        defaultEstadoRvaAuto = estadoRvaAutoRepositorio.find("ERA002").orElse(null);
        record.setEstadoreservaautoCodigo(defaultEstadoRvaAuto);
    }
    @Override
    protected RvaAuto newRecord() {
        return new RvaAuto();
    }

    @Override
    protected AbstractRepositorio<RvaAuto> getRepositorio() {
        return repositorio;
    }

    public void validate(FacesContext facesContext, UIComponent component, java.lang.Object object){
        validateUnique(facesContext, component, object, record -> record.getCodigoRvaAuto().equals(object.toString()) );
    }


}