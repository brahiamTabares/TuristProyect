package bases.repositorio;

import entidades.EstadoA;
import entidades.RvaPaqTur;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RvaPaqTurRepositorio extends AbstractRepositorio<RvaPaqTur>{


    @Override
    protected Class<RvaPaqTur> getClazz() {
        return RvaPaqTur.class;
    }

    @Override
    protected String extractIdFromEntity(RvaPaqTur record) {
        return record.getCodRpt();
    }
}
