package bases.repositorio;
import entidades.RegimenHosp;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RegimenHospRepositorio extends AbstractRepositorio<RegimenHosp>{


    @Override
    protected Class<RegimenHosp> getClazz() {
        return RegimenHosp.class;
    }

    @Override
    protected String extractIdFromEntity(RegimenHosp record) {
        return record.getCodigo();
    }
}