package bases.repositorio;

import entidades.EstadoA;
import entidades.RvaAuto;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RvaAutRepositorio extends AbstractRepositorio<RvaAuto>{


    @Override
    protected Class<RvaAuto> getClazz() {
        return RvaAuto.class;
    }

    @Override
    protected String extractIdFromEntity(RvaAuto record) {
        return record.getCodigoRvaAuto();
    }
}
