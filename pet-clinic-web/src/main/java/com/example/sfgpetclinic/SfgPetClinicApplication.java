package com.example.sfgpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgPetClinicApplication {

    public static void main(String[] args) {
      ApplicationContext ctx= (ApplicationContext) SpringApplication.run(SfgPetClinicApplication.class, args);

      System.out.println("hello world");
    }

}
