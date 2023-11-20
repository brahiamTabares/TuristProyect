package bases.repositorio;

import entidades.Habitacion;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HabitacionRepositorio extends AbstractRepositorio<Habitacion>{


    @Override
    protected Class<Habitacion> getClazz() {
        return Habitacion.class;
    }

    @Override
    protected String extractIdFromEntity(Habitacion record) {
        return record.getId();
    }
}
