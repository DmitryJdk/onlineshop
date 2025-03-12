package ru.home.shop.business;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.home.shop.registration.dto.request.RegistrationRequest;
import ru.home.shop.registration.dto.response.RegistrationResponse;
import ru.home.shop.registration.service.RegistrationService;

@RestController
@RequiredArgsConstructor
public class BusinessController {

    private final RegistrationService registrationService;

    @PostMapping("/hello")
    public RegistrationResponse hello(@RequestBody RegistrationRequest request) {
        return registrationService.registerUser(request);
    }
}
