package bases.repositorio;

import entidades.EstadoAuto;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EstadoAutoRepositorio extends AbstractRepositorio<EstadoAuto>{


    @Override
    protected Class<EstadoAuto> getClazz() {
        return EstadoAuto.class;
    }

    @Override
    protected String extractIdFromEntity(EstadoAuto record) {
        return record.getCodigo();
    }
}
