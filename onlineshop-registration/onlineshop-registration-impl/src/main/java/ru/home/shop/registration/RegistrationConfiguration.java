package ru.home.shop.registration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.home.shop.registration.service.RegistrationService;
import ru.home.shop.registration.service.RegistrationServiceImpl;

@Configuration
@ConditionalOnMissingBean(RegistrationService.class)
public class RegistrationConfiguration {

    @Bean
    public RegistrationService registrationService() {
        return new RegistrationServiceImpl();
    }
}
