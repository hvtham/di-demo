package com.example.didemo.controllers;

import com.example.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello(){
        System.out.println("Hello from myController");
        return "foo";
    }
}
