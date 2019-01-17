package lib.seu.ac.bd.LibraryApplication;

import lib.seu.ac.bd.LibraryApplication.Service.DummyDataService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(LibraryApplication.class, args);
		//run.getBean(DummyDataService.class).presistDummyData();
	}

}

