package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.helloworld.repository")
public class HelloWorldMicroservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldMicroservice1Application.class, args);
	}

}
