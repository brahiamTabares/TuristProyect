package bases.beans;


import bases.beans.GenericBean;
import bases.repositorio.*;
import entidades.Administrador;
import entidades.Articulo;
import entidades.EstadoA;
import entidades.EstadoArt;
import jakarta.annotation.PostConstruct;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ViewScoped
@Named
public class ArticuloBean extends GenericBean<Articulo> {

    @Inject
    private ArticuloRepositorio repositorio;
    @Inject
    private EstadoArtRepositorio estadoArtRepositorio;
    private EstadoArt defaultEstado;
    @PostConstruct
    public void init(){
        records = repositorio.get();
        defaultEstado = estadoArtRepositorio.find("E001").orElse(null);
        record.setEstado(defaultEstado);
    }

    @Override
    protected Articulo newRecord() {
        var nuevo = new Articulo();
        nuevo.setEstado(defaultEstado);
        return nuevo;
    }

    @Override
    protected AbstractRepositorio<Articulo> getRepositorio() {
        return repositorio;
    }

    public void validate(FacesContext facesContext, UIComponent component, java.lang.Object object){
        validateUnique(facesContext, component, object, record -> record.getCodigo().equals(object.toString()) );
    }
}
