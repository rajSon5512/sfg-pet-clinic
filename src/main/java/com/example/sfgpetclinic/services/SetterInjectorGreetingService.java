package com.example.sfgpetclinic.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectorGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "hello world-setter";
    }
}
