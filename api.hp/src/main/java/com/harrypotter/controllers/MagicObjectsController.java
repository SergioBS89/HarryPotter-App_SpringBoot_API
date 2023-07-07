package com.harrypotter.controllers;

import com.harrypotter.entities.Horocruxes;
import com.harrypotter.entities.MagicObjects;
import com.harrypotter.entities.Reliques;
import com.harrypotter.entities.Wander;
import com.harrypotter.services.MagicObjectsService;
import com.harrypotter.services.WanderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    //TODO
//    @Autowired
//    private HorocruxeService wanderService; ADD HOROCRUXES HERE and RELIQUES


    @GetMapping("")
    public List<MagicObjects> findAll(){
        return magicObjectsService.findAll();
    }

    @GetMapping("/wanders")
    public List<Wander> findAllWanders(){
        return wanderService.findAll();
    }

//    @GetMapping("/horocruxes")
//    public List<Horocruxes> findAllHorocruxes(){
//        return wanderService.findAll();
//    }
//
//    @GetMapping("/reliques")
//    public List<Reliques> findAllReliques(){
//        return wanderService.findAll();
//    }
}
