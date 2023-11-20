package bases.beans;

import bases.repositorio.*;
import entidades.Estadorvahosp;
import entidades.RvaHosp;
import jakarta.annotation.PostConstruct;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ViewScoped
@Named
public class RvaHospedajeBean extends GenericBean<RvaHosp> {

    @Inject
    private RvaHosRepositorio repositorio;
    @Inject
    private EstadoRvaHospRepositorio   estadorvahospRepositorio;

    private Estadorvahosp defaultEstado;
    @PostConstruct
    public void init(){
        records = repositorio.get();
        defaultEstado = estadorvahospRepositorio.find("ERH002").orElse(null);
        record.setEstadorvahospCodigo(defaultEstado);

    }
    @Override
    protected RvaHosp newRecord() {
        return new RvaHosp();
    }

    @Override
    protected AbstractRepositorio<RvaHosp> getRepositorio() {
        return repositorio;
    }

    public void validate(FacesContext facesContext, UIComponent component, java.lang.Object object){
        validateUnique(facesContext, component, object, record -> record.getCodRvaHosp().equals(object.toString()) );
    }


}

