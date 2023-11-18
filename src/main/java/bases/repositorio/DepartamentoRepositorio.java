package bases.repositorio;

import entidades.Departamento;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DepartamentoRepositorio extends AbstractRepositorio<Departamento>{


    @Override
    protected Class<Departamento> getClazz() {
        return Departamento.class;
    }

    @Override
    protected String extractIdFromEntity(Departamento record) {
        return record.getCodDep();
    }
}
