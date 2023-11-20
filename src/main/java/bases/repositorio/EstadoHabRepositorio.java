package bases.repositorio;

import entidades.EstadoHab;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EstadoHabRepositorio extends AbstractRepositorio<EstadoHab>{


    @Override
    protected Class<EstadoHab> getClazz() {
        return EstadoHab.class;
    }

    @Override
    protected String extractIdFromEntity(EstadoHab record) {
        return record.getCodEh();
    }
}