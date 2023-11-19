package bases.repositorio;

import entidades.Cliente;
import entidades.CompraArticulo;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CompraArticuloRepositorio extends AbstractRepositorio<CompraArticulo>{


    @Override
    protected Class<CompraArticulo> getClazz() {
        return CompraArticulo.class;
    }

    @Override
    protected String extractIdFromEntity(CompraArticulo record) {
        return record.getCodigocart();
    }
}