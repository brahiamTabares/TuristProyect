package bases.repositorio;

import entidades.EstadoA;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EstadoARepositorio extends AbstractRepositorio<EstadoA>{


    @Override
    protected Class<EstadoA> getClazz() {
        return EstadoA.class;
    }

    @Override
    protected String extractIdFromEntity(EstadoA record) {
        return record.getCodigo();
    }
}
