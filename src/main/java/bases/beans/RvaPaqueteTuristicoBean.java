package bases.beans;


import bases.beans.GenericBean;
import bases.repositorio.*;
import entidades.Articulo;
import entidades.EstadoArt;
import entidades.EstadoRvaPaq;
import entidades.RvaPaqTur;
import jakarta.annotation.PostConstruct;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ViewScoped
@Named
public class RvaPaqueteTuristicoBean extends GenericBean<RvaPaqTur> {

    @Inject
    private RvaPaqueteTuristicoRepositorio repositorio;
    @Inject
    private EstadoRvaPaqRepositorio estadoRvaPaqRepositorio;
    private EstadoRvaPaq defaultEstado;

    @PostConstruct
    public void init(){
        records = repositorio.get();
        defaultEstado = estadoRvaPaqRepositorio.find("ERPAQ001").orElse(null);
        record.setEstadoRvaPaqCodigo(defaultEstado);
    }

    @Override
    protected RvaPaqTur newRecord() {
        var nuevo = new RvaPaqTur();
        nuevo.setEstadoRvaPaqCodigo(defaultEstado);
        return nuevo;
    }

    @Override
    protected AbstractRepositorio<RvaPaqTur> getRepositorio() {
        return repositorio;
    }

    public void validate(FacesContext facesContext, UIComponent component, java.lang.Object object){
        validateUnique(facesContext, component, object, record -> record.getCodRpt().equals(object.toString()) );
    }
}