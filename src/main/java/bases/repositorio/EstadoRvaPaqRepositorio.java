package bases.repositorio;

import entidades.EstadoRvaPaq;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EstadoRvaPaqRepositorio extends AbstractRepositorio<EstadoRvaPaq>{


    @Override
    protected Class<EstadoRvaPaq> getClazz() {
        return EstadoRvaPaq.class;
    }

    @Override
    protected String extractIdFromEntity(EstadoRvaPaq record) {
        return record.getCodigo();
    }
}