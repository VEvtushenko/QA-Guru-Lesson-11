package demo.qa.tests.properties;

import demo.qa.config.CredentionalsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class OwnerTest {
    CredentionalsConfig config = ConfigFactory.create(CredentionalsConfig.class);

    @Test
    @Tag("Owner")
    void loginTest() {
        String login = config.login(),
               password = config.password();

        System.out.println("Login: " + login);
        System.out.println("Password: " + password);
    }
}
