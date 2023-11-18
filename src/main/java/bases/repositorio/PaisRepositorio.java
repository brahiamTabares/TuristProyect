package bases.repositorio;

import entidades.EstadoA;
import entidades.Pais;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PaisRepositorio extends AbstractRepositorio<Pais>{


    @Override
    protected Class<Pais> getClazz() {
        return Pais.class;
    }

    @Override
    protected String extractIdFromEntity(Pais record) {
        return record.getCodigo();
    }
}
