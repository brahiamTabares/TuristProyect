package bases.repositorio;

import entidades.EstadoA;
import entidades.EstadoRvaAuto;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EstadoRvaAutoRepositorio extends AbstractRepositorio<EstadoRvaAuto>{


    @Override
    protected Class<EstadoRvaAuto> getClazz() {
        return EstadoRvaAuto.class;
    }

    @Override
    protected String extractIdFromEntity(EstadoRvaAuto record) {
        return record.getCodigo();
    }
}
