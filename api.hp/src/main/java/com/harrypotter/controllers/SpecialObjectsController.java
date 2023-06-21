package com.harrypotter.controllers;

import com.harrypotter.entities.SpecialObjects;
import com.harrypotter.services.SpecialObjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/special_objects")
public class SpecialObjectsController {

    @Autowired
    private SpecialObjectsService specialObjectsService;

    @GetMapping("")
    public List<SpecialObjects> findAll(){
        return specialObjectsService.findAll();
    }

}
