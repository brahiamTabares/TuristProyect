package bases.repositorio;

import entidades.EstadoHab;
import entidades.NivelHabitacion;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NivelHabRepositorio extends AbstractRepositorio<NivelHabitacion>{


    @Override
    protected Class<NivelHabitacion> getClazz() {
        return NivelHabitacion.class;
    }

    @Override
    protected String extractIdFromEntity(NivelHabitacion record) {
        return record.getCodigoNH();
    }
}