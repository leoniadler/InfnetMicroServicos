package br.edu.infnet.clientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import br.edu.infnet.clientes.modelo.services.ClienteService;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ClientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientesApplication.class, args);
		
		ClienteService clienteService = new ClienteService();
	}

}


//Erro no applcation properties
//spring.profiles.active=default
//spring.config.import=configserver:http://localhost:8888