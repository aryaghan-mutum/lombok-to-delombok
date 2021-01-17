package com.lomboktodelombok;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class LombokToDelombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokToDelombokApplication.class, args);
		log.info("Application Started.");
	}

}
