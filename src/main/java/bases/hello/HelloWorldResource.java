package bases.hello;

import bases.repositorio.AdministradorRepositorio;
import entidades.Administrador;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;

@Path("hello")
public class HelloWorldResource {
    @PersistenceContext
    private EntityManager entityManager;

    @Inject
    AdministradorRepositorio repositorio;

    @GET
    public Response hello(@QueryParam("name") String name) {
        var query = entityManager
                .createQuery("select admin from Administrador admin");
        var resultado = query.getResultList();
        if ((name == null) || name.trim().isEmpty()) {
            name = "world ";
        }
        return Response
                .ok(repositorio.get())
                .build();
    }

    
        
}