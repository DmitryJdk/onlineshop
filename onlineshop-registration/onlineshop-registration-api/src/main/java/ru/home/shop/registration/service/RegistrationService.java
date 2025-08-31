package ru.home.shop.registration.service;

import ru.home.shop.registration.model.RegistrationRequest;
import ru.home.shop.registration.model.RegistrationResponse;

public interface RegistrationService {

    RegistrationResponse registerUser(RegistrationRequest request);
}
