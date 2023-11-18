package bases.repositorio;

import entidades.Articulo;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ArticuloRepositorio extends AbstractRepositorio<Articulo>{


    @Override
    protected Class<Articulo> getClazz() {
        return Articulo.class;
    }

    @Override
    protected String extractIdFromEntity(Articulo record) {
        return record.getCodigo();
    }
}
