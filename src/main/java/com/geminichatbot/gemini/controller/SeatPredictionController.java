package com.geminichatbot.gemini.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geminichatbot.gemini.service.SeatPredictionService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/prediction")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class SeatPredictionController {

	  private final SeatPredictionService predictionService;

	    @PostMapping("/seat-confirmation")
	    public Map<String, Object> predict(@RequestBody Map<String, Object> body) {

	        int wl = (int) body.get("waitlist");
	        String train = (String) body.get("trainNumber");
	        String date = (String) body.get("journeyDate");
	        String classType = (String) body.get("classType");

	        return predictionService.predictSeatConfirmation(train, date, wl, classType);
	    }
}
