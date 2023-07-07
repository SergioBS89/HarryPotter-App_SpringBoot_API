package com.harrypotter.controllers;

import com.harrypotter.entities.House;
import com.harrypotter.entities.Place;
import com.harrypotter.entities.Wizard;
import com.harrypotter.services.HouseService;
import com.harrypotter.services.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/places")
public class PlaceController {
    
    @Autowired
    private PlaceService placeService;

    @Autowired
    private HouseService houseService;

    @GetMapping("")
    public List <Place> findAll(){
        return placeService.findAll();
    }


    /**
     * Find Houses by name
     */
    @GetMapping("/house/{name}")
    public House findByName(@PathVariable String name){
        return houseService.findByName(name);
    }

    @GetMapping("/houses")
    public List<House> findAllHouses() {
        return houseService.findAll();
    }
}