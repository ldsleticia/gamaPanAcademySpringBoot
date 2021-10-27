package br.com.springcomgama.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@RequestMapping(method = RequestMethod.GET) mapeia o método
//@RequestMapping(path = "/saudacao") mapeia a porta que você quer que vá aquela requisição
//altshiftsetapracima manda a parte selecionada para cima
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping //mapeia o método
	public String ola(){
		return "Hello Word";
	}
}

