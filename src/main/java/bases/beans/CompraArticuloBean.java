package bases.beans;

import bases.repositorio.*;
import entidades.Administrador;
import entidades.CompraArticulo;
import entidades.EstadoA;
import entidades.Estadocart;
import jakarta.annotation.PostConstruct;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;




@ViewScoped
@Named
public class CompraArticuloBean extends GenericBean<CompraArticulo> {

    @Inject
    private CompraArticuloRepositorio repositorio;
    @Inject
    private EstadocartRepositorio estadoCartRepositorio;
    private Estadocart defaultEstado;
    @PostConstruct
    public void init(){
        records = repositorio.get();
        defaultEstado = estadoCartRepositorio.find("EA001").orElse(null);
        record.setEstado(defaultEstado);
    }

    @Override
    protected CompraArticulo newRecord() {
        var nuevo = new CompraArticulo();
        nuevo.setEstado(defaultEstado);
        return nuevo;
    }

    @Override
    protected AbstractRepositorio<CompraArticulo> getRepositorio() {
        return repositorio;
    }

    public void validate(FacesContext facesContext, UIComponent component, java.lang.Object object){
        validateUnique(facesContext, component, object, record -> record.getCodigocart().equals(object.toString()) );
    }
}
