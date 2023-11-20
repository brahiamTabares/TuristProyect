package bases.repositorio;

import entidades.RvaPaqTur;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RvaPaqueteTuristicoRepositorio extends AbstractRepositorio<RvaPaqTur>{


    @Override
    protected Class<RvaPaqTur> getClazz() {
        return RvaPaqTur.class;
    }

    @Override
    protected String extractIdFromEntity(RvaPaqTur record) {
        return record.getCodRpt();
    }
}