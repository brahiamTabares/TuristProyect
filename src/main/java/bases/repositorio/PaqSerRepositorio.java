package bases.repositorio;

import entidades.PaqServ;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PaqSerRepositorio extends AbstractRepositorio<PaqServ>{


    @Override
    protected Class<PaqServ> getClazz() {
        return PaqServ.class;
    }

    @Override
    protected String extractIdFromEntity(PaqServ record) {
        return record.getCodPserv();
    }
}
