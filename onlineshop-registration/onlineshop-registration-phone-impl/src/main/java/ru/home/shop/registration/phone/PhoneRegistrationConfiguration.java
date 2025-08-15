package ru.home.shop.registration.phone;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.home.shop.registration.service.RegistrationService;
import ru.home.shop.registration.phone.service.PhoneRegistrationServiceImpl;

@Slf4j
@Configuration
@ConditionalOnProperty(prefix = "registration", name = "version", havingValue = "v1")
public class PhoneRegistrationConfiguration {

    @Bean
    public RegistrationService registrationService() {
        log.info("Creating phone registration service v1");
        return new PhoneRegistrationServiceImpl();
    }
}
