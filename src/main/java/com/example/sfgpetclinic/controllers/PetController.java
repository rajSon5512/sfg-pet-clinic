package com.example.sfgpetclinic.controllers;

import com.example.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Controller;

@Controller
public class PetController{

    private final PetService petService;


    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIstheBest(){
        return petService.sayYourPetName();
    }
}
