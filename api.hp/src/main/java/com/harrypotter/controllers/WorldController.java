package com.harrypotter.controllers;

import com.harrypotter.entities.World;
import com.harrypotter.services.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorldController {

    @Autowired
    private WorldService worldService;

    @GetMapping("")
    public List<World> show(){
        return worldService.show();
    }
}
