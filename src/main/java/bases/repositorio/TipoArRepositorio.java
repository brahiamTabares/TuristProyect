package bases.repositorio;

import entidades.EstadoA;
import entidades.TipoArt;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TipoArRepositorio extends AbstractRepositorio<TipoArt>{


    @Override
    protected Class<TipoArt> getClazz() {
        return TipoArt.class;
    }

    @Override
    protected String extractIdFromEntity(TipoArt record) {
        return record.getCodTipoart();
    }
}
