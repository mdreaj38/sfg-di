package guru.springframework.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;

/**
 * @author rejaul.reaj
 * @since 11/18/21
 */
@ConstructorBinding
@ConfigurationProperties("guru")
public class SfgConstructorConf {

    private String username;
    private String password;
    private String jdbcurl;

    public SfgConstructorConf(String username, String password, String jdbcurl) {
        this.username = username;
        this.password = password;
        this.jdbcurl = jdbcurl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getJdbcurl() {
        return jdbcurl;
    }
}
