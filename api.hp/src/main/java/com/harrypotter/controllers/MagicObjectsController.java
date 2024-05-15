package com.harrypotter.controllers;

import com.harrypotter.entities.*;
import com.harrypotter.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/objects")
public class MagicObjectsController {

    @Autowired
    private MagicObjectsService magicObjectsService;

    @GetMapping("/{name}")
    public MagicObjects findByName(@PathVariable String name) {
        return magicObjectsService.findByName(name);
    }

    @GetMapping("/{criteria}/{page}")
    public Page<MagicObjects> findObjectsByCategory(@PathVariable Integer page, @PathVariable String criteria){
        return switch (criteria){
            case "horocruxes" -> magicObjectsService.findHorocruxesList(PageRequest.of(page, 8));
            case "wanders" -> magicObjectsService.findWandersList(PageRequest.of(page, 8));
            case "others-objects" -> magicObjectsService.findOthersObjects(PageRequest.of(page, 8));
            case "quiddich" -> magicObjectsService.findQuddichObjects(PageRequest.of(page, 8));
            case "hollows" -> magicObjectsService.findHollows(PageRequest.of(page, 8));
            default -> throw new IllegalArgumentException("Nothing found using criteria: "  + criteria);
        };
    }
}
