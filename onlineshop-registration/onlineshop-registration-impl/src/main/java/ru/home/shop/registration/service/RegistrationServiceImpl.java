package ru.home.shop.registration.service;

import ru.home.shop.registration.dto.request.RegistrationRequest;
import ru.home.shop.registration.dto.response.RegistrationResponse;

import java.util.UUID;

public class RegistrationServiceImpl implements RegistrationService {

    @Override
    public RegistrationResponse registerUser(RegistrationRequest registerRequestDTO) {
        return new RegistrationResponse(UUID.randomUUID().toString());
    }
}
