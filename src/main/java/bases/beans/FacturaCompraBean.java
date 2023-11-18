


package bases.beans;


import bases.beans.GenericBean;
import bases.repositorio.AbstractRepositorio;
import bases.repositorio.AdministradorRepositorio;
import bases.repositorio.EstadoARepositorio;
import bases.repositorio.FacturaCRepositorio;
import entidades.Administrador;
import entidades.EstadoA;
import entidades.FacturaC;
import jakarta.annotation.PostConstruct;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ViewScoped
@Named
public class FacturaCompraBean extends GenericBean<FacturaC> {

    @Inject
    private FacturaCRepositorio repositorio;
    @PostConstruct
    public void init(){
        records = repositorio.get();
    }

    @Override
    protected FacturaC newRecord() {
        var nuevo = new FacturaC();
        return nuevo;
    }

    @Override
    protected AbstractRepositorio<FacturaC> getRepositorio() {
        return repositorio;
    }

    public void validate(FacesContext facesContext, UIComponent component, java.lang.Object object){
        validateUnique(facesContext, component, object, record -> record.getCodFac().equals(object.toString()) );
    }
}
