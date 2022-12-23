package com.harrypotter.controllers;

import com.harrypotter.entities.Pet;
import com.harrypotter.entities.Wander;
import com.harrypotter.services.PetService;
import com.harrypotter.services.WanderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping("")
    public List<Pet> findAll(){
        return petService.findAll();
    }

}
