package bases.repositorio;

import entidades.EstadoA;
import entidades.TipoHotel;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TipoHotelRepositorio extends AbstractRepositorio<TipoHotel>{


    @Override
    protected Class<TipoHotel> getClazz() {
        return TipoHotel.class;
    }

    @Override
    protected String extractIdFromEntity(TipoHotel record) {
        return record.getCodTipoh();
    }
}
