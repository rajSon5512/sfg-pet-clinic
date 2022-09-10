package com.example.sfgpetclinic.controllers;

import com.example.sfgpetclinic.services.ConstructorGreetingServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){
        controller=new PropertyInjectedController();
        controller.greetingService=new ConstructorGreetingServices();
    }


    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}