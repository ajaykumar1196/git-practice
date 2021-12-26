package com.example.gitpractice.service;

import org.springframework.stereotype.Service;

@Service
public class FeatureAService {

    public String getGreeting() {
        return "Hello World from A";
    }
}
