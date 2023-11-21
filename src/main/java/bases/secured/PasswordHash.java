package bases.secured;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.Map;

@ApplicationScoped
public class PasswordHash implements jakarta.security.enterprise.identitystore.PasswordHash {

    @Override
    public void initialize(Map<String, String> parameters) {

    }

    @Override
    public String generate(char[] password) {
        return new String(password);
    }

    @Override
    public boolean verify(char[] password, String hashedPassword) {
        return generate(password).equals(hashedPassword);
    }
}
