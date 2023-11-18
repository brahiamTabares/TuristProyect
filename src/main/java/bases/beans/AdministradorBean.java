package bases.beans;


import bases.repositorio.AbstractRepositorio;
import bases.repositorio.AdministradorRepositorio;
import bases.repositorio.EstadoARepositorio;
import entidades.Administrador;
import entidades.EstadoA;
import jakarta.annotation.PostConstruct;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ViewScoped
@Named
public class AdministradorBean extends GenericBean<Administrador> {

    @Inject
    private AdministradorRepositorio repositorio;
    @Inject
    private EstadoARepositorio estadoARepositorio;
    private EstadoA defaultEstado;
    @PostConstruct
    public void init(){
        records = repositorio.get();
        defaultEstado = estadoARepositorio.find("EA001").orElse(null);
        record.setEstado(defaultEstado);
    }

    @Override
    protected Administrador newRecord() {
        var nuevo = new Administrador();
        nuevo.setEstado(defaultEstado);
        return nuevo;
    }

    @Override
    protected AbstractRepositorio<Administrador> getRepositorio() {
        return repositorio;
    }

    public void validate(FacesContext facesContext, UIComponent component, java.lang.Object object){
        validateUnique(facesContext, component, object, record -> record.getCodAdm().equals(object.toString()) );
    }
}
