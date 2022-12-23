package com.harrypotter.controllers;

import com.harrypotter.entities.Secret;
import com.harrypotter.entities.Wander;
import com.harrypotter.services.SecretService;
import com.harrypotter.services.WanderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/secret")
public class SecretController {

    @Autowired
    private SecretService secretService;

    @GetMapping("")
    public List<Secret> findAll(){
        return secretService.findAll();
    }

}
