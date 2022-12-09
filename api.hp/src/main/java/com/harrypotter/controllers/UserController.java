package com.harrypotter.controllers;

import java.util.List;

import com.harrypotter.entities.Wizard;
import com.harrypotter.entities.House;
import com.harrypotter.services.HouseService;
import com.harrypotter.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    
    @Autowired
    private UserService userService;

    @Autowired
    private HouseService houseService;

    @GetMapping("/")
    public List <Wizard> findAll(){

        return userService.findAll();
    }

    @GetMapping("/house")
    public List <House> findAllHouses(){

        return houseService.findAll();
    }
}