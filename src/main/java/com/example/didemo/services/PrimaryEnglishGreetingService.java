package com.example.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"en","default"})
@Primary
public class PrimaryEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from English!!!";
    }
}
