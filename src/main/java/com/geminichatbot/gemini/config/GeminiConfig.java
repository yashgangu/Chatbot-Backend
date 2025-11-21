package com.geminichatbot.gemini.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;


import com.google.genai.Client;


@Configuration
public class GeminiConfig {
	
	 @Value("${GOOGLE_API_KEY}")
	    private String apiKey;

	@Bean
	public Client geminiClient() {
		System.out.println("API KEY = " + apiKey);

		return new Client.Builder()
				.apiKey(apiKey)
				.build();
	} 
}