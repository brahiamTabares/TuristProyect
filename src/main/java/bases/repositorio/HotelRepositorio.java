package bases.repositorio;

import entidades.Hotel;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HotelRepositorio extends AbstractRepositorio<Hotel>{


    @Override
    protected Class<Hotel> getClazz() {
        return Hotel.class;
    }

    @Override
    protected String extractIdFromEntity(Hotel record) {
        return record.getCodHotel();
    }
}
