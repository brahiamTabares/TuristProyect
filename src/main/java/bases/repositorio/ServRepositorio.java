package bases.repositorio;

import entidades.EstadoA;
import entidades.Servicio;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ServRepositorio extends AbstractRepositorio<Servicio>{


    @Override
    protected Class<Servicio> getClazz() {
        return Servicio.class;
    }

    @Override
    protected String extractIdFromEntity(Servicio record) {
        return record.getCodServ();
    }
}
