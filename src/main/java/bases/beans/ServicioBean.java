package bases.beans;

import bases.repositorio.AbstractRepositorio;

import bases.repositorio.ServRepositorio;
import entidades.Servicio;
import jakarta.annotation.PostConstruct;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ViewScoped
@Named
public class ServicioBean extends GenericBean<Servicio> {

    @Inject
    private ServRepositorio repositorio;

    @PostConstruct
    public void init() {
        records = repositorio.get();

    }

    @Override
    protected Servicio newRecord() {
        var nuevo = new Servicio();
        return nuevo;
    }

    @Override
    protected AbstractRepositorio<Servicio> getRepositorio() {
        return repositorio;
    }

    public void validate(FacesContext facesContext, UIComponent component, java.lang.Object object) {
        validateUnique(facesContext, component, object, record -> record.getCodServ().equals(object.toString()));
    }
}
