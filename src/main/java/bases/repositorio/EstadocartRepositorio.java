package bases.repositorio;

import entidades.EstadoA;
import entidades.Estadocart;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EstadocartRepositorio extends AbstractRepositorio<Estadocart>{


    @Override
    protected Class<Estadocart> getClazz() {
        return Estadocart.class;
    }

    @Override
    protected String extractIdFromEntity(Estadocart record) {
        return record.getCodigo();
    }
}
