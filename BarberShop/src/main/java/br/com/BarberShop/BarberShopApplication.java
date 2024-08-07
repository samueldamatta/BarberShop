package br.com.BarberShop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import br.com.BarberShop.Principal.Principal;

@SpringBootApplication
public class BarberShopApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BarberShopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
