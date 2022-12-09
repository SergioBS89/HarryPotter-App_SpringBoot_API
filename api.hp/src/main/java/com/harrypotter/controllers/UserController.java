package com.harrypotter.controllers;

import java.util.List;

import com.harrypotter.entities.MaterialMagics;
import com.harrypotter.entities.Wizard;
import com.harrypotter.entities.House;
import com.harrypotter.services.HouseService;
import com.harrypotter.services.MaterialService;
import com.harrypotter.services.WizardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    
    @Autowired
    private WizardService userService;

    @Autowired
    private HouseService houseService;

    @Autowired
    private MaterialService materialService;

    @GetMapping("/")
    public List <Wizard> findAll(){

        return userService.findAll();
    }

    @GetMapping("/house")
    public List <House> findAllHouses(){

        return houseService.findAll();
    }

    @GetMapping("/house/{id}")
    public House getHouseById(@PathVariable Integer id){
        return houseService.findById(id);
    }

    @GetMapping("/material")
    public List <MaterialMagics> findAllMaterial(){

        return materialService.findAll();
    }
}