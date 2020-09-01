package com.doherty.gatewayexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.codec.ServerCodecConfigurer;

@SpringBootApplication
public class GatewayExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayExampleApplication.class, args);
	}


//	@Bean
//	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//		return builder.routes()
//				.route(p -> p
//						.path("/dog/hello")
//						.filters(f -> f.addRequestHeader("Hello", "World"))
//						.uri("http://localhost:8080"))
//				.build();
//	}


}


