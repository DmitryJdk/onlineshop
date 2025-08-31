package ru.home.shop.business.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.home.shop.registration.controller.RegistrationController;
import ru.home.shop.registration.model.RegistrationRequest;
import ru.home.shop.registration.model.RegistrationResponse;
import ru.home.shop.registration.service.RegistrationService;

@RestController
@RequiredArgsConstructor
public class RegistrationControllerImpl implements RegistrationController {

    private final RegistrationService registrationService;

    public ResponseEntity<RegistrationResponse> register(RegistrationRequest request) {
        RegistrationResponse response =  registrationService.registerUser(request);
        return ResponseEntity.ok(response);
    }
}
