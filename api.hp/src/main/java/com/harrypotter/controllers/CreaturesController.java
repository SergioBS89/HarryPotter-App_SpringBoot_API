package com.harrypotter.controllers;

import com.harrypotter.entities.Creature;
import com.harrypotter.services.CreaturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/creatures")
public class CreaturesController {

    @Autowired
    private CreaturesService creaturesService;

    @GetMapping("/pages/{page}")
    public Page<Creature> findAll(@PathVariable Integer page){
        return creaturesService.findAll(PageRequest.of(page, 8));
    }

    @GetMapping("/{raze}")
    public Creature findByRaze(@PathVariable String raze){
        return creaturesService.findByRace(raze);
    }
    @GetMapping("/{criteria}/{page}")
    public Page<Creature> findCreatureByCategory(@PathVariable Integer page, @PathVariable String criteria) {
        return switch (criteria) {
            case "danger" -> creaturesService.findDangerCreaturesList(PageRequest.of(page, 8));
            case "nodanger" -> creaturesService.findNoDangerCreaturesList(PageRequest.of(page, 8));
            default -> throw new IllegalArgumentException("Invalid criteria: " + criteria);
        };
    }
}
