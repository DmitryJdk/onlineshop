package ru.home.shop.registration.email.service;

import ru.home.shop.registration.dto.request.RegistrationRequest;
import ru.home.shop.registration.dto.response.RegistrationResponse;
import ru.home.shop.registration.service.RegistrationService;

import java.util.UUID;

public class EmailRegistrationServiceImpl implements RegistrationService {

    @Override
    public RegistrationResponse registerUser(RegistrationRequest registerRequestDTO) {
        return new RegistrationResponse(UUID.randomUUID().toString(), "email");
    }
}
