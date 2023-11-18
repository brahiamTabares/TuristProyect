package bases.repositorio;

import entidades.EstadoA;
import entidades.ServsAdAuto;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ServsAdAutRepositorio extends AbstractRepositorio<ServsAdAuto>{


    @Override
    protected Class<ServsAdAuto> getClazz() {
        return ServsAdAuto.class;
    }

    @Override
    protected String extractIdFromEntity(ServsAdAuto record) {
        return record.getCodServadauto();
    }
}
