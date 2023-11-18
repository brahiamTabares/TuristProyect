package bases.repositorio;

import entidades.EstadoA;
import entidades.GamaAuto;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GamaAutoRepositorio extends AbstractRepositorio<GamaAuto>{


    @Override
    protected Class<GamaAuto> getClazz() {
        return GamaAuto.class;
    }

    @Override
    protected String extractIdFromEntity(GamaAuto record) {
        return record.getCodigo();
    }
}
