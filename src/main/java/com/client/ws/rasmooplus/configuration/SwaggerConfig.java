package com.client.ws.rasmooplus.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("RasmoPlus API")
                        .version("0.0.1")
                        .description("API para atender o cliente Rasmo Plus")
                        .contact(new Contact()
                                .name("Daniel desenvolvedor Java")
                                .email("daniel.vicenzo77@gmail.com")
                        ));
    }
}
