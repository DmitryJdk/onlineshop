package ru.home.shop.registration.service;

import ru.home.shop.registration.dto.request.RegistrationRequest;
import ru.home.shop.registration.dto.response.RegistrationResponse;

public interface RegistrationService {

    RegistrationResponse registerUser(RegistrationRequest request);
}
