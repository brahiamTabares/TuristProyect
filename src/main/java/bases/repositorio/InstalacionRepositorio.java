package bases.repositorio;

import entidades.EstadoA;
import entidades.Instalacion;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class InstalacionRepositorio extends AbstractRepositorio<Instalacion>{


    @Override
    protected Class<Instalacion> getClazz() {
        return Instalacion.class;
    }

    @Override
    protected String extractIdFromEntity(Instalacion record) {
        return record.getCodInst();
    }
}
