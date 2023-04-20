package ru.kechemasov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "ru.kechemasov")
public class SpringBootMain {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMain.class);
	}
}