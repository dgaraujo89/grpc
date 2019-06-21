package com.github.diegogomesaraujo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class SpringBootServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServerApplication.class, args);
	}

}
