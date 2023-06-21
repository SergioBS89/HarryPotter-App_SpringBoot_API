package com.harrypotter.controllers;

import com.harrypotter.entities.Family;
import com.harrypotter.services.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/family")
public class FamilyController {
    
    @Autowired
    private FamilyService familyService;

    @GetMapping("")
    public List <Family> findAll(){

        return familyService.findAll();
    }

    @GetMapping("/{id}")
    public Family findByID(@PathVariable Integer id){
        return familyService.findByID(id);
    }
}