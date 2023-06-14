package com.nhnacademy.broadcastrouter.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouterConfig {
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                // task api
                .route(r -> r.path("/project/api/**")
                        .uri("http://localhost:1998"))
                // account api
                .route(r -> r.path("/account/api/**")
                        .uri("http://localhost:1999"))
                .build();
    }
}
