package bases.repositorio;

import entidades.MarcaAuto;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MarcaAutoRepositorio extends AbstractRepositorio<MarcaAuto>{


    @Override
    protected Class<MarcaAuto> getClazz() {
        return MarcaAuto.class;
    }

    @Override
    protected String extractIdFromEntity(MarcaAuto record) {
        return record.getCodigo();
    }
}
