package com.harrypotter.controllers;

import com.harrypotter.entities.House;
import com.harrypotter.services.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

}
