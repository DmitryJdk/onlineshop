package ru.home.shop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        log.info("Application started");
        log.info("http://localhost:8071/sw/swagger-ui.html");
        log.info("http://localhost:8071/sw/api-docs");
        log.info("http://localhost:8071/sw/api-docs/x-registration");
        log.info("http://localhost:8071/sw/api-docs/x-actuator");
        log.info("http://localhost:8072/actuator");
    }

}