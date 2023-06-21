package com.harrypotter.controllers;

import com.harrypotter.entities.Mortifagos;
import com.harrypotter.entities.Wizard;
import com.harrypotter.services.MortifagoService;
import com.harrypotter.services.WizardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/mortifagos")
public class MortifagoController {
    
    @Autowired
    private MortifagoService mortifagoService;

    @GetMapping("")
    public List <Mortifagos> findAll(){

        return mortifagoService.findAll();
    }
/*
    @GetMapping("/{name}")
    public Mortifagos findByName(@PathVariable String name){
        return mortifagoService.findByName(name);
    }*/
}