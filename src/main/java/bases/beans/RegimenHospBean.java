package bases.beans;

import bases.repositorio.AbstractRepositorio;
import bases.repositorio.FacturaCRepositorio;

import bases.repositorio.RegimenHospRepositorio;
import entidades.FacturaC;
import entidades.RegimenHosp;
import jakarta.annotation.PostConstruct;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ViewScoped
@Named
public class RegimenHospBean extends GenericBean<RegimenHosp> {

    @Inject
    private RegimenHospRepositorio repositorio;
    @PostConstruct
    public void init(){
        records = repositorio.get();
    }

    @Override
    protected RegimenHosp newRecord() {
        var nuevo = new RegimenHosp();
        return nuevo;
    }

    @Override
    protected AbstractRepositorio<RegimenHosp> getRepositorio() {
        return repositorio;
    }

    public void validate(FacesContext facesContext, UIComponent component, java.lang.Object object){
        validateUnique(facesContext, component, object, record -> record.getCodigo().equals(object.toString()) );
    }
}
