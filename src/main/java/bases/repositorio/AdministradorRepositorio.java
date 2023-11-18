package bases.repositorio;

import entidades.Administrador;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class AdministradorRepositorio extends AbstractRepositorio<Administrador>{

    public List<Administrador> findByName(String name){
        var query = entityManager
                .createQuery("select admin from Administrador admin where admin.nombreA = :name", Administrador.class);

        query.setParameter("name",name);
        return query.getResultList();
    }


    public List<Administrador> findByName2(String name){
        var query = entityManager
                .createNativeQuery("select * from Administrador a where a.nombreA =?1", Administrador.class);

        query.setParameter(1,name);
        return query.getResultList();
    }

    @Override
    protected Class<Administrador> getClazz() {
        return Administrador.class;
    }

    @Override
    protected String extractIdFromEntity(Administrador record) {
        return record.getCodAdm();
    }
}
