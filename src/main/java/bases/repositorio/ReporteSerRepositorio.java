package bases.repositorio;

import entidades.EstadoA;
import entidades.ReporteSer;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ReporteSerRepositorio extends AbstractRepositorio<ReporteSer>{


    @Override
    protected Class<ReporteSer> getClazz() {
        return ReporteSer.class;
    }

    @Override
    protected String extractIdFromEntity(ReporteSer record) {
        return record.getCodigoRe();
    }
}
