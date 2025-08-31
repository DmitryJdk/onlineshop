package ru.home.shop.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenApiConfiguration {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Registration Service API")
                        .version("1.0.0")
                        .description("""
                                API для регистрации и управления пользователями.
                                Поддерживает регистрацию через email и номер телефона.
                                """))
                .servers(List.of(
                        new Server().url("http://localhost:8071").description("Development")
                ));
    }

    @Bean
    public GroupedOpenApi registrationApi() {
        return GroupedOpenApi.builder()
                .group("x-registration")
                .pathsToMatch("/api/registration")
                .build();
    }

    @Bean
    public GroupedOpenApi actuatorApi() {
        return GroupedOpenApi.builder()
                .group("x-actuator")
                .pathsToMatch("/actuator/**")
                .build();
    }
}