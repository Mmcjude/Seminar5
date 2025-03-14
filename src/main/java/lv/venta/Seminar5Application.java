package lv.venta;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lv.venta.model.Product;
import lv.venta.repo.IProductRepo;

@SpringBootApplication
public class Seminar5Application {

	public static void main(String[] args) {
		SpringApplication.run(Seminar5Application.class, args);
	}
	
	//TODO need to be run automatically
	@Bean
	public CommandLineRunner testModel(IProductRepo prodRepo) {
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				Product p1 = new Product("Banana", 1.99f, "Eco, yellow", 5);
				Product p2 = new Product( "Grapes", 4.99f, "purple", 10);
				Product p3 = new Product( "Watermelon", 2.99f, "purple", 10);
				prodRepo.save(p1);
				prodRepo.save(p3);
				prodRepo.save(p2);
				
						
				
				
				
			}
		};
	}
	

}