package bases.repositorio;

import entidades.EstadoA;
import entidades.ServsARvado;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ServARvadoRepositorio extends AbstractRepositorio<ServsARvado>{


    @Override
    protected Class<ServsARvado> getClazz() {
        return ServsARvado.class;
    }

    @Override
    protected String extractIdFromEntity(ServsARvado record) {
        return record.getCodServarv();
    }
}
