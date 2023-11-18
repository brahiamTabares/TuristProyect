package bases.repositorio;

import entidades.EstadoA;
import entidades.TipoAuto;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TipoAutRepositorio extends AbstractRepositorio<TipoAuto>{


    @Override
    protected Class<TipoAuto> getClazz() {
        return TipoAuto.class;
    }

    @Override
    protected String extractIdFromEntity(TipoAuto record) {
        return record.getCodigo();
    }
}
