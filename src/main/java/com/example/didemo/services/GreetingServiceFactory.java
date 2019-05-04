package com.example.didemo.services;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang){
        switch (lang){
            case "en":
                return new PrimaryGreetingService(greetingRepository);
            case "fr":
                return new PrimaryFrenchGreetingService(greetingRepository);
            case "vn":
                return new PrimaryVietnameseGreetingService(greetingRepository);
                default:
                    return new PrimaryGreetingService(greetingRepository);

        }
    }
}
