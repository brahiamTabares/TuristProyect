package bases.repositorio;

import entidades.EstadoA;
import entidades.EstadoArt;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EstadoArtRepositorio extends AbstractRepositorio<EstadoArt>{


    @Override
    protected Class<EstadoArt> getClazz() {
        return EstadoArt.class;
    }

    @Override
    protected String extractIdFromEntity(EstadoArt record) {
        return record.getCodigo();
    }
}
