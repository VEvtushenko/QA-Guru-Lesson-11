package demo.qa.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/credentions.properties")
public interface CredentionalsConfig extends Config {
    String login();
    String password();
}
