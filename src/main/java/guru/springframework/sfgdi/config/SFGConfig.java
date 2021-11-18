package guru.springframework.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author rejaul.reaj
 * @since 11/18/21
 */
@ConfigurationProperties("com")
@Configuration
public class SFGConfig {

    private String username;
    private String password;
    private String jdbcurl;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJdbcurl() {
        return jdbcurl;
    }

    public void setJdbcurl(String jdbcurl) {
        this.jdbcurl = jdbcurl;
    }
}