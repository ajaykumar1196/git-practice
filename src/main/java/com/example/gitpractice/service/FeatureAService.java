package com.example.gitpractice.service;

import org.springframework.stereotype.Service;

@Service
public class FeatureAService {

    public String getGreetingMessage() {
        return "Hello World from A";
    }
}
