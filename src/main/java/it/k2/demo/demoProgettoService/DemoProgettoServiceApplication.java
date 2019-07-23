package it.k2.demo.demoProgettoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoProgettoServiceApplication {

    @Autowired
    BooksComponent bc;

	public static void main(String[] args) {

	    SpringApplication.run(DemoProgettoServiceApplication.class, args);
	}

}
