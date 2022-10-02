package com.example.sfgpetclinic.bootstrap;

import com.example.sfgpetclinic.model.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.sfgpetclinic.services.*;

import java.time.LocalDate;

/**
 * Created by jt on 7/25/18.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;

    }

    @Override
    public void run(String... args) throws Exception {
            loadData();
    }

    private void loadData() {


        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");


        ownerService.save(owner2);


        System.out.println("Loaded Owners....");


        System.out.println("Loaded Vets....");
    }
}