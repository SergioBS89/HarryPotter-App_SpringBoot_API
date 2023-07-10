package com.harrypotter.controllers;

import com.harrypotter.entities.Horocruxes;
import com.harrypotter.entities.MagicObjects;
import com.harrypotter.entities.Reliques;
import com.harrypotter.entities.Wander;
import com.harrypotter.services.HorocruxesService;
import com.harrypotter.services.MagicObjectsService;
import com.harrypotter.services.ReliquesService;
import com.harrypotter.services.WanderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/objects")
public class MagicObjectsController {

    @Autowired
    private MagicObjectsService magicObjectsService;
    @Autowired
    private WanderService wanderService;
    @Autowired
    private HorocruxesService horocruxesService;
    @Autowired
    private ReliquesService reliquesService;


    @GetMapping("")
    public List<MagicObjects> findAll(){
        return magicObjectsService.findAll();
    }

    @GetMapping("/wanders")
    public List<Wander> findAllWanders(){
        return wanderService.findAll();
    }

    @GetMapping("/horocruxes")
    public List<Horocruxes> findAllHorocruxes(){
        return horocruxesService.findAll();
    }

    @GetMapping("/horocruxes/{name}")
    public Horocruxes findHorocruxesByName(@PathVariable String name){
        return horocruxesService.findHorocruxesByName(name);
    }

    @GetMapping("/reliques")
    public List<Reliques> findAllReliquesList(){
        return reliquesService.findAllReliquesList();
    }

    @GetMapping("/reliques/{name}")
    public Reliques findReliquesByName(@PathVariable String name){
        return reliquesService.findReliquesByName(name);
    }
}
