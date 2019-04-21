package com.example.didemo.config;

import com.example.didemo.services.PrimaryVietnameseGreetingService;

//@Configuration
public class DiDemoConfig {

    //@Bean
    public PrimaryVietnameseGreetingService vietnameseGreetingService(){
        return new PrimaryVietnameseGreetingService();
    }

}
