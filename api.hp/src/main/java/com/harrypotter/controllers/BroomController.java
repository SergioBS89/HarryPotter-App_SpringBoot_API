package com.harrypotter.controllers;

import com.harrypotter.entities.Broom;
import com.harrypotter.entities.Wander;
import com.harrypotter.services.BroomService;
import com.harrypotter.services.WanderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/broom")
public class BroomController {

    @Autowired
    private BroomService broomService;

    @GetMapping("")
    public List<Broom> findAll(){
        return broomService.findAll();
    }

}
