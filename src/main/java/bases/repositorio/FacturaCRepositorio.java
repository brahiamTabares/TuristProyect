package bases.repositorio;

import entidades.EstadoA;
import entidades.FacturaC;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FacturaCRepositorio extends AbstractRepositorio<FacturaC>{


    @Override
    protected Class<FacturaC> getClazz() {
        return FacturaC.class;
    }

    @Override
    protected String extractIdFromEntity(FacturaC record) {
        return record.getCodFac();
    }
}
