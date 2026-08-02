package com.tambalahari.springboot_beginner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
    "com.tambalahari.springboot_beginner",
    "com.controllers",
    "com.services",
    "com.models"
})
public class SpringbootBeginnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBeginnerApplication.class, args);
	}

}
