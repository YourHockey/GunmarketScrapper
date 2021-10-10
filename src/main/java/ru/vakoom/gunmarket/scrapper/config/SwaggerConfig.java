package ru.vakoom.gunmarket.scrapper.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

import static springfox.documentation.builders.RequestHandlerSelectors.basePackage;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/*"))
                .apis(basePackage("ru.vakoom.gunmarket.scrapper.web.controller"))
                .build()
                .apiInfo(apiDetails());
    }

    private ApiInfo apiDetails() {
        return new ApiInfo(
                "Offer Extractor service API",
                "Offer Extractor Service BackEnd app. Service for Gun Equipment Aggregator 'Gun Market'",
                "0.1",
                "No terms of use",
                new Contact("Gun Market", "http://.ru", "-"),
                "API License",
                "-",
                Collections.emptyList()
        );
    }

}
