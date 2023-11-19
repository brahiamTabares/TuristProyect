package bases.repositorio;


import entidades.Articulo;
import entidades.Estadocliente;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EstadoClienteRepositorio extends AbstractRepositorio<Estadocliente>{


    @Override
    protected Class<Estadocliente> getClazz() {
        return Estadocliente.class;
    }

    @Override
    protected String extractIdFromEntity(Estadocliente record) {
        return record.getCodestadoc();
    }
}