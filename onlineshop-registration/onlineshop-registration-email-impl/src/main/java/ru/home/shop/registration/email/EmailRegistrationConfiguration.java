package ru.home.shop.registration.email;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.home.shop.registration.service.RegistrationService;
import ru.home.shop.registration.email.service.EmailRegistrationServiceImpl;

@Slf4j
@Configuration
@ConditionalOnProperty(prefix = "shop.registration", name = "type", havingValue = "email")
public class EmailRegistrationConfiguration {

    @Bean
    public RegistrationService registrationService() {
        log.info("Create email registration service v2");
        return new EmailRegistrationServiceImpl();
    }
}
