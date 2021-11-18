package guru.springframework.sfgdi.config;

import com.springframework.pets.CatPetService;
import com.springframework.pets.DogPetService;
import com.springframework.pets.PetServicesFactory;
import guru.springframework.sfgdi.datasource.FakeDataSource;
import guru.springframework.sfgdi.services.*;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * @author rejaul.reaj
 * @since 11/18/21
 */
@EnableConfigurationProperties(SfgConstructorConf.class)
@Configuration
public class GreetingServiceConfig {
    @Bean
    FakeDataSource fakeDataSource(SFGConfig sfgConfig) {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(sfgConfig.getUsername());
        fakeDataSource.setPassword(sfgConfig.getPassword());
        fakeDataSource.setJdbcurl(sfgConfig.getJdbcurl());
        return fakeDataSource;
    }

    @Bean
    PetServicesFactory petServicesFactory() {
        return new PetServicesFactory();
    }

    @Profile("cat")
    @Bean
    CatPetService catPetService(PetServicesFactory petServicesFactory) {
        return (CatPetService) petServicesFactory.getPetService("cat");
    }

    @Profile({"dog", "default"})
    @Bean
    DogPetService dogPetService(PetServicesFactory petServicesFactory) {
        return (DogPetService) petServicesFactory.getPetService("dog");
    }

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18NSpanishService i18NSpanishService() {
        return new I18NSpanishService();
    }

    @Profile("EN")
    @Bean
    I18nEnglishGreetingService i18nService() {
        return new I18nEnglishGreetingService();
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }
}