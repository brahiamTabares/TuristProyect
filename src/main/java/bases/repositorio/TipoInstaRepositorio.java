package bases.repositorio;

import entidades.EstadoA;
import entidades.TipoInst;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TipoInstaRepositorio extends AbstractRepositorio<TipoInst>{


    @Override
    protected Class<TipoInst> getClazz() {
        return TipoInst.class;
    }

    @Override
    protected String extractIdFromEntity(TipoInst record) {
        return record.getCodTipoi();
    }
}
