package bases.repositorio;

import entidades.EstadoA;
import entidades.PaqTuristico;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PaqTuristicoRepositorio extends AbstractRepositorio<PaqTuristico>{


    @Override
    protected Class<PaqTuristico> getClazz() {
        return PaqTuristico.class;
    }

    @Override
    protected String extractIdFromEntity(PaqTuristico record) {
        return record.getCodPaqTur();
    }
}
