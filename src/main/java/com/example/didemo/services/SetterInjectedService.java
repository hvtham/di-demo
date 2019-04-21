package com.example.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - Injected by Setter method";
    }
}
