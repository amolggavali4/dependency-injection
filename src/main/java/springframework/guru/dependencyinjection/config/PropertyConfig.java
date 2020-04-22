package springframework.guru.dependencyinjection.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import springframework.guru.dependencyinjection.beans.FakeDataSource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {
    /*@Value("${username}")
    private String user;

    @Value("${password}")
    private String password;

    @Value("${dburl}")
    private String dbUrl;
    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fds = new FakeDataSource();
        fds.setUser(user);
        fds.setPassword(password);
        fds.setDbUrl(dbUrl);
        return fds;
    }*/
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer properties = new PropertySourcesPlaceholderConfigurer();
        return properties;
    }
}
