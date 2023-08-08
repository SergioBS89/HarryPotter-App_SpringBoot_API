package com.harrypotter.controllers;

import com.harrypotter.entities.*;
import com.harrypotter.services.*;
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
    @Autowired
    private WizardService wizardService;
    @Autowired
    private PlacesAroundHPWorldService placesAroundHPWorldService;
    @Autowired
    private HogwartsPlacesService hogwartsPlacesService;


    @GetMapping("")
    public List<Place> findAll() {
        return placeService.findAll();
    }

    @GetMapping("/hogwarts/house/{name}")
    public House findByName(@PathVariable String name) {
        return houseService.findByName(name);
    }

    @GetMapping("/hogwarts/houses")
    public List<House> findAllHouses() {
        return houseService.findAll();
    }

    @GetMapping("/hogwarts/sites")
    public List<HogwartsPlaces> findHogwartsSites() {
        return hogwartsPlacesService.findAll();
    }

    @GetMapping("/hogwarts/sites/{name}")
    public HogwartsPlaces findHogwartsPlacesByName(@PathVariable String name) {
        return hogwartsPlacesService.findByName(name);
    }
    @GetMapping("/world/sites")
    public List<PlacesAroundHPWorld> findPlacesAroundWorldList() {
        return placesAroundHPWorldService.findAll();
    }

    @GetMapping("/world/sites/{name}")
    public PlacesAroundHPWorld findHPWorldPlacesByName(@PathVariable String name) {
        return placesAroundHPWorldService.findByName(name);
    }
}