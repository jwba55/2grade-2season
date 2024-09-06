package com.student.studentintroduce.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
@SecurityScheme(name = "Bearer Authentication", type = SecuritySchemeType.HTTP, bearerFormat = "JWT", scheme = "bearer")
public class OpenApiConfig {

    @Bean
    OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info().title("학생정보시스템 API")
                        .description("모든 학생정보시스템 API")
                        .version("1.0").contact(new Contact().name("Sallo Szrajbman")
                                .email("www.baeldung.com").url("salloszraj@gmail.com"))
                        .license(new License().name("License of API")
                                .url("API license URL")));
    }

    @Bean
    GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("public")
                .packagesToScan("com.student.studentintroduce.controller.general")
                .build();
    }

    @Bean
    GroupedOpenApi allApi() {
        return GroupedOpenApi.builder()
                .group("all")
                .packagesToScan("com.student.studentintroduce.controller")
                .build();
    }

    @Bean
    GroupedOpenApi userApi() {
        return GroupedOpenApi.builder()
                .group("user")
                .packagesToScan("com.student.studentintroduce.controller.user")
                .build();
    }

    @Bean
    GroupedOpenApi adminApi() {
        return GroupedOpenApi.builder()
                .group("admin")
                .packagesToScan("com.student.studentintroduce.admin")
                .build();
    }

}