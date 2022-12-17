package com.tweetapp.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
// Spring Boot saves the hassle of coding and unnecessary configuration  //features like dependency injection
@SpringBootApplication  // It's same as declaring a class with @Configuration, @EnableAutoConfiguration and @ComponentScan annotations. Therefore, @SpringBootApplication is a combination of three annotations @Configuration (used for Java-based configuration), @ComponentScan (used for component scanning), and @EnableAutoConfiguration (used to enable auto-configuration in Spring Boot).
@EnableMongoAuditing    // To connect to MongoDB database
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
