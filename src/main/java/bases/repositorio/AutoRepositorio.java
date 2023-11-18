package bases.repositorio;


import entidades.Auto;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AutoRepositorio extends AbstractRepositorio<Auto>{


    @Override
    protected Class<Auto> getClazz() {
        return Auto.class;
    }

    @Override
    protected String extractIdFromEntity(Auto record) {
        return record.getCodAuto();
    }
}
