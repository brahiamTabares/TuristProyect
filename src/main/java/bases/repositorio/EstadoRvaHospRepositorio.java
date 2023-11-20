package bases.repositorio;

import entidades.EstadoA;
import entidades.Estadorvahosp;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EstadoRvaHospRepositorio extends AbstractRepositorio<Estadorvahosp>{


    @Override
    protected Class<Estadorvahosp> getClazz() {
        return Estadorvahosp.class;
    }

    @Override
    protected String extractIdFromEntity(Estadorvahosp record) {
        return record.getCodigo();
    }
}