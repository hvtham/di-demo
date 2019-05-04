package com.example.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class PrimaryVietnameseGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryVietnameseGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }
    @Override
    public String sayGreeting() {
        return greetingRepository.getVietnameseGreeting();
    }
}
