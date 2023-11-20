package bases.repositorio;

import entidades.TipoAuto;
import entidades.TipoPaq;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TipoPaqRepositorio extends AbstractRepositorio<TipoPaq>{


    @Override
    protected Class<TipoPaq> getClazz() {
        return TipoPaq.class;
    }

    @Override
    protected String extractIdFromEntity(TipoPaq record) {
        return record.getCodTipopaq();


    }
}