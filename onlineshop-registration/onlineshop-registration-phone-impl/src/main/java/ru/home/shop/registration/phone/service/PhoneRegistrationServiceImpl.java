package ru.home.shop.registration.phone.service;

import ru.home.shop.registration.model.RegistrationRequest;
import ru.home.shop.registration.model.RegistrationResponse;
import ru.home.shop.registration.model.RegistrationStatus;
import ru.home.shop.registration.model.RegistrationType;
import ru.home.shop.registration.service.RegistrationService;

import java.util.UUID;

public class PhoneRegistrationServiceImpl implements RegistrationService {

    @Override
    public RegistrationResponse registerUser(RegistrationRequest registerRequestDTO) {
        return new RegistrationResponse()
                .uuid(UUID.randomUUID())
                .type(RegistrationType.PHONE)
                .status(RegistrationStatus.CONFIRMED);
    }
}
