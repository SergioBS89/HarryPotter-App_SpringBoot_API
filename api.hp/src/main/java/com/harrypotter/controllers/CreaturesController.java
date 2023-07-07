package com.harrypotter.controllers;

import com.harrypotter.entities.Creatures;
import com.harrypotter.services.CreaturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/creatures")
public class CreaturesController {

    @Autowired
    private CreaturesService creaturesService;

    @GetMapping("/danger")
    public List<Creatures> findDangerCreatueres(){
        return creaturesService.findDangerCreaturesList();
    }

    @GetMapping("/nodanger")
    public List<Creatures> findNoDangerCreatures(){
        return creaturesService.findNoDangerCreaturesList();
    }
}
