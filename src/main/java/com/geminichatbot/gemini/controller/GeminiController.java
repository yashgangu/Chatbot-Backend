package com.geminichatbot.gemini.controller;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geminichatbot.gemini.service.GeminiService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/gemini")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class GeminiController {

	private final GeminiService geminiService;
	
    
	@PostMapping("/ask")
	public CompletableFuture<String> askGemini(@RequestBody Map<String, String> body) {
	    
	    String prompt = body.get("prompt");
	    
	    
	    return geminiService.askGemini(prompt);
	}

}