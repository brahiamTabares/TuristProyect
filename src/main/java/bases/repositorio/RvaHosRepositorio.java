package bases.repositorio;

import entidades.RvaHosp;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RvaHosRepositorio extends AbstractRepositorio<RvaHosp>{


    @Override
    protected Class<RvaHosp> getClazz() {
        return RvaHosp.class;
    }

    @Override
    protected String extractIdFromEntity(RvaHosp record) {
        return record.getCodRvaHosp();
    }
}
