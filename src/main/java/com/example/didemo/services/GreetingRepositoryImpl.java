package com.example.didemo.services;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImpl implements  GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting Service";
    }

    @Override
    public String getFrenchGreeting() {
        return "Bonjour - Service d'accueil primaire";
    }

    @Override
    public String getVietnameseGreeting() {
        return "Xin chào - Dịch vụ chào hỏi chính";
    }
}
