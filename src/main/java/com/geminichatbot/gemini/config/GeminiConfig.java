package com.geminichatbot.gemini.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.api.client.util.Value;
import com.google.genai.Client;

@Configuration
public class GeminiConfig {
	
	 @Value("${GOOGLE_API_KEY}")
	    private String apiKey;

	@Bean
	public Client geminiClient() {
		return new Client.Builder()
				.apiKey(apiKey)
				.build();
	} 
}
