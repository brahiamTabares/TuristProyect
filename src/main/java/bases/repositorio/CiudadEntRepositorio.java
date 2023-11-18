package bases.repositorio;


import entidades.CiudadEnt;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CiudadEntRepositorio extends AbstractRepositorio<CiudadEnt>{


    @Override
    protected Class<CiudadEnt> getClazz() {
        return CiudadEnt.class;
    }

    @Override
    protected String extractIdFromEntity(CiudadEnt record) {
        return record.getCodigo();
    }
}
