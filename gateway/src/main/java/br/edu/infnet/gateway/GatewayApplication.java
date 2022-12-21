package br.edu.infnet.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GatewayApplication {
	
	@Bean
	public RouteLocator route(RouteLocatorBuilder builder) {
		return builder.routes()
						.route(p -> p
								.path("/clientes/**")
								.uri("http://localhost:8989")
								
								)
						
						.route(p -> p
								.path("/produtos/**")
								
								.uri("http://localhost:8383")
								)
						.route(p -> p
								.path("/compras/**")
								.filters(f -> f.circuitBreaker(
										config -> config
										.setName("mycmd")
										.setFallbackUri("forward:/fallback")
										
										))
								.uri("http://localhost:8181")
								)
								
						
						.build();
	}
	@GetMapping("/fallback")
	public String fallback() {
		return "Volte mais tarde!!";
	}
	

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

}
