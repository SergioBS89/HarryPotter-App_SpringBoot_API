package com.harrypotter.controllers;

import java.util.List;

import com.harrypotter.entities.MaterialMagic;
import com.harrypotter.entities.Wizard;
import com.harrypotter.entities.House;
import com.harrypotter.services.HouseService;
import com.harrypotter.services.MaterialService;
import com.harrypotter.services.WizardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/wizard")
public class WizardController {
    
    @Autowired
    private WizardService wizardService;

    @GetMapping("/")
    public List <Wizard> findAll(){

        return wizardService.findAll();
    }

    @GetMapping("/{name}")
    public Wizard findByName(@PathVariable String name){
        return wizardService.findByName(name);
    }
}