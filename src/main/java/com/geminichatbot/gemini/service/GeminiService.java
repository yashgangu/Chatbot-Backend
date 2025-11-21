

package com.geminichatbot.gemini.service;

import org.springframework.stereotype.Service;
import org.springframework.scheduling.annotation.Async; 
import java.util.concurrent.CompletableFuture; 

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GeminiService {

    private final Client client;

    @Async
    public CompletableFuture<String> askGemini(String prompt) {

        String finalPrompt =
            "You are an IRCTC Assistant. Answer in short, clear bullet points. " +
            "Avoid long paragraphs. Give exact train names, timings, and steps.\n\n" +
            "User: " + prompt;

        System.out.println("Prompt received in thread: " + Thread.currentThread().getName());

        GenerateContentResponse response = 
            client.models.generateContent("gemini-2.5-flash", finalPrompt, null);

        System.out.println("Response generated in thread: " + Thread.currentThread().getName());

        return CompletableFuture.completedFuture(response.text());
    }
}
