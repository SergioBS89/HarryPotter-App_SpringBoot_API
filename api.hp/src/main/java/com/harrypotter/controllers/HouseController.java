package com.harrypotter.controllers;

import com.harrypotter.entities.House;
import com.harrypotter.entities.Wizard;
import com.harrypotter.services.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/house")
public class HouseController {
    @Autowired
    private HouseService houseService;

    @GetMapping("")
    public List<House> findAllHouses(){
        return houseService.findAll();
    }

    @GetMapping("/{id}")
    public House getHouseById(@PathVariable Integer id){
        return houseService.findById(id);
    }

    @GetMapping("/{name}")
    public House findByName(@PathVariable String name){
        return houseService.findByName(name);
    }

}
