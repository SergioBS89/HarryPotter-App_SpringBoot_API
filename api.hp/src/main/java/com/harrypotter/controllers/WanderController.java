package com.harrypotter.controllers;

import com.harrypotter.entities.Wander;
import com.harrypotter.services.WanderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/wander")
public class WanderController {

    @Autowired
    private WanderService wanderService;

    @GetMapping("")
    public List<Wander> findAll(){
        return wanderService.findAll();
    }

}
