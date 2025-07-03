package com.javatechie.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdActionsApplication {

	@GetMapping("/bienvenida")
	public String welcome() {
		return "Qué notable, se desplegó haciendo git commit y git push";
	}
	// Archivo de prueba
	//Hacemos otro commit mas
	//Un commit hoy
	//Ojalá que funcione
	//Hacemos otro commit mas xD
	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionsApplication.class, args);
	}

}
