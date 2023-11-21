package bases.secured;

import jakarta.annotation.security.DeclareRoles;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import jakarta.security.enterprise.authentication.mechanism.http.FormAuthenticationMechanismDefinition;
import jakarta.security.enterprise.authentication.mechanism.http.LoginToContinue;
import jakarta.security.enterprise.identitystore.DatabaseIdentityStoreDefinition;
import jakarta.ws.rs.Produces;

import java.util.HashMap;
import java.util.Map;


@DatabaseIdentityStoreDefinition(
        dataSourceLookup = "java:app/turis/db",
        callerQuery= "#{'select password from VISTA_USUARIOS where CODIGO_USUARIO = ?'}",
        groupsQuery = "select ROL from VISTA_ROL where CODIGO_USUARIO = ?",
        hashAlgorithm = PasswordHash.class,
        priorityExpression = "#{'100'}",
        hashAlgorithmParameters = {
                "${applicationConfig.hashAlgorithmParameters}"
        }
)

@FormAuthenticationMechanismDefinition(
    loginToContinue = @LoginToContinue(
        loginPage="/login.xhtml",
        errorPage="/login_error.xhtml"
    )
)
@DeclareRoles({ "user", "admin" })
@ApplicationScoped
@Named
public class ApplicationConfig {

    public String[] getHashAlgorithmParameters() {
        return getHashAlgorithmParameterMap().entrySet()
                .stream()
                .map(entry -> entry.getKey() + "=" + entry.getValue())
                .toArray(String[]::new);
    }

    @Produces
    public Map<String, String> getHashAlgorithmParameterMap() {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("Pbkdf2PasswordHash.Iterations", "3072");
        parameters.put("Pbkdf2PasswordHash.Algorithm", "PBKDF2WithHmacSHA512");
        parameters.put("Pbkdf2PasswordHash.SaltSizeBytes", "64");
        return parameters;
    }

}
