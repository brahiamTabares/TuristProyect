package bases.repositorio;

import entidades.TipoArt;
import entidades.TipoAuto;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TipoArtRepositorio extends AbstractRepositorio<TipoArt>{


    @Override
    protected Class<TipoArt> getClazz() {
        return TipoArt.class;
    }

    @Override
    protected String extractIdFromEntity(TipoArt record) {
        return record.getCodTipoart();
    }
}