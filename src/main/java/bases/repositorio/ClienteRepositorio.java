package bases.repositorio;

import entidades.Articulo;
import entidades.Cliente;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ClienteRepositorio extends AbstractRepositorio<Cliente>{


    @Override
    protected Class<Cliente> getClazz() {
        return Cliente.class;
    }

    @Override
    protected String extractIdFromEntity(Cliente record) {
        return record.getCedula();
    }
}
