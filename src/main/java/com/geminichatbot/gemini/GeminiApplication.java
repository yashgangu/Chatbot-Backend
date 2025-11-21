package com.geminichatbot.gemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class GeminiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeminiApplication.class, args);
	}

}
