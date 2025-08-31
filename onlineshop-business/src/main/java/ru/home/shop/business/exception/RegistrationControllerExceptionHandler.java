package ru.home.shop.business.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.home.shop.business.controller.RegistrationControllerImpl;
import ru.home.shop.registration.model.RegistrationError;

import java.time.OffsetDateTime;

@RestControllerAdvice(basePackageClasses = RegistrationControllerImpl.class)
public class RegistrationControllerExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<RegistrationError> handleIllegalArgumentException(MethodArgumentNotValidException ex) {
        RegistrationError error = new RegistrationError()
                .timestamp(OffsetDateTime.now())
                .error("Invalid request")
                .message(ex.getMessage())
                .status(HttpStatus.BAD_REQUEST.value());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
    }
}