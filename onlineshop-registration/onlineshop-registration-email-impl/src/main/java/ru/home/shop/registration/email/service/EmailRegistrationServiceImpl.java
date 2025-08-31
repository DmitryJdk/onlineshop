package ru.home.shop.registration.email.service;

import ru.home.shop.registration.model.RegistrationRequest;
import ru.home.shop.registration.model.RegistrationResponse;
import ru.home.shop.registration.model.RegistrationStatus;
import ru.home.shop.registration.model.RegistrationType;
import ru.home.shop.registration.service.RegistrationService;

import java.util.UUID;

public class EmailRegistrationServiceImpl implements RegistrationService {

    @Override
    public RegistrationResponse registerUser(RegistrationRequest registerRequestDTO) {
        return new RegistrationResponse()
                .uuid(UUID.randomUUID())
                .type(RegistrationType.EMAIL)
                .status(RegistrationStatus.CONFIRMED);
    }
}
