package com.example.gitpractice.service;

import org.springframework.stereotype.Service;

@Service
public class FeatureAService {

    public String getGreeting() {
        String s = "Hello World from A user - feature 3";
        return "Hello World from A user - feature 3";
    }
}
