package com.harrypotter.controllers;

import com.harrypotter.entities.*;
import com.harrypotter.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:4200" })
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
    @Autowired
    private QuiddichService quiddichService;
    @Autowired
    private OthersObjectsService othersObjectsService;


    @GetMapping("")
    public List<MagicObjects> findAllObjects(){
        return magicObjectsService.findAllObjects();
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

    @GetMapping("/quiddich")
    public List<QuiddichObjects> findAllQuiddichList(){
        return quiddichService.findAll();
    }

    @GetMapping("/others/{page}")
    public Page<OtherMagicObjects> findAllOtherObjects(@PathVariable Integer page){
        return othersObjectsService.findAll(PageRequest.of(page, 8));
    }
}
