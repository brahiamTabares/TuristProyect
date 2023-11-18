package bases.repositorio;
import entidades.HorarioPaq;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HorarioPaqRepositorio extends AbstractRepositorio<HorarioPaq>{


    @Override
    protected Class<HorarioPaq> getClazz() {
        return HorarioPaq.class;
    }

    @Override
    protected String extractIdFromEntity(HorarioPaq record) {
        return record.getCodigo();
    }
}
