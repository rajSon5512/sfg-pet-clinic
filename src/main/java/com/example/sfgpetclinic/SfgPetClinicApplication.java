package com.example.sfgpetclinic;

import com.example.sfgpetclinic.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgPetClinicApplication {

    public static void main(String[] args) {
      ApplicationContext ctx= (ApplicationContext) SpringApplication.run(SfgPetClinicApplication.class, args);

        MyController myController=(MyController) ctx.getBean("myController");

      System.out.println("---- Primay");
       System.out.println(myController.sayHello());

        System.out.println("---- Propert");

        PropertyInjectedController propertyInjectedController=
                (PropertyInjectedController) ctx.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("---- Constructor");

        ConstructorInjectedController constructorInjectedController=
                (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());

      System.out.println("---- setter");

      SetterInjectedController setterInjectedController=
              (SetterInjectedController) ctx.getBean("setterInjectedController");

      System.out.println(setterInjectedController.getGreeting());

      System.out.println("---Which pet is best");

        PetController petController=
                (PetController) ctx.getBean("petController");

        System.out.println(petController.whichPetIstheBest());

    }

}
