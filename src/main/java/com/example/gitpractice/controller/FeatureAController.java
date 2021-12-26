package com.example.gitpractice.controller;

import com.example.gitpractice.service.FeatureAService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a")
public class FeatureAController {

    private FeatureAService featureAService;

    public FeatureAController(FeatureAService featureAService) {
        this.featureAService = featureAService;
    }

    @GetMapping(value = "greeting")
    public ResponseEntity<String> greeting(){
        String message = featureAService.getGreeting();
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
