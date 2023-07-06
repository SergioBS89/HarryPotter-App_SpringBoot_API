package com.harrypotter.controllers;

import com.harrypotter.entities.Family;
import com.harrypotter.services.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/family")
public class FamilyController {
    
    @Autowired
    private FamilyService familyService;

    @GetMapping("")
    public List <Family> findAll(){

        return familyService.findAll();
    }



    @GetMapping("/{name}")
    public Family findByName(@PathVariable String name){
        return familyService.findByName(name);
    }
}