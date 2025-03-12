package ru.home.shop.registration.service;

import org.springframework.stereotype.Service;
import ru.home.shop.registration.dto.request.RegistrationRequest;
import ru.home.shop.registration.dto.response.RegistrationResponse;

import java.util.UUID;

@Service
public class RegistrationServiceImpl implements RegistrationService {
    @Override
    public RegistrationResponse registerUser(RegistrationRequest registerRequestDTO) {
        return new RegistrationResponse(UUID.randomUUID().toString());
    }
}
