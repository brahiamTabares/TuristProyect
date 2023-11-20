package bases.repositorio;

import entidades.EstadoA;
import entidades.TipoHab;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TipoHabRepositorio extends AbstractRepositorio<TipoHab>{


    @Override
    protected Class<TipoHab> getClazz() {
        return TipoHab.class;
    }

    @Override
    protected String extractIdFromEntity(TipoHab record) {
        return record.getCodTipohab();
    }
}