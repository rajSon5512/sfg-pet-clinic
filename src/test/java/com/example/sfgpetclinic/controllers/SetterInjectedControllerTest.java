package com.example.sfgpetclinic.controllers;

import com.example.sfgpetclinic.services.ConstructorGreetingServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp(){
        controller=new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingServices());
    }



    @Test
    void getGreetingService() {
        System.out.println(controller.getGreeting());
    }
}