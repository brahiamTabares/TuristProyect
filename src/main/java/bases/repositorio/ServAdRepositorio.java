package bases.repositorio;

import entidades.EstadoA;
import entidades.ServAd;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ServAdRepositorio extends AbstractRepositorio<ServAd> {


    @Override
    protected Class<ServAd> getClazz() {
        return ServAd.class;
    }

    @Override
    protected String extractIdFromEntity(ServAd record) {
        return record.getCodServad();
    }
}
