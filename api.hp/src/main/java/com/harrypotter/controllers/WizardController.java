package com.harrypotter.controllers;

import java.util.List;

import com.harrypotter.entities.Wander;
import com.harrypotter.entities.Wizard;
import com.harrypotter.services.WanderService;
import com.harrypotter.services.WizardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/wizards")
public class WizardController {

    @Autowired
    private WizardService wizardService;
    @Autowired
    private WanderService wanderService;


    @GetMapping("")
    public List<Wizard> findAll() {

        return wizardService.findAll();
    }

    @GetMapping("/{name}")
    public Wizard findByName(@PathVariable String name) {
        return wizardService.findByName(name);
    }

    @GetMapping("/family/{name}")
    public List<Wizard> findFamilyByName(@PathVariable String name) {
        return wizardService.findFamilyByName(name);
    }

    @GetMapping("/mortifagos")
    public List<Wizard> findMortifagosList() {
        return wizardService.findMortifagosList();
    }

    @GetMapping("/aurores")
    public List<Wizard> findAurorList() {
        return wizardService.findAurorList();
    }

    @GetMapping("/students")
    public List<Wizard> findStudentsList() {
        return wizardService.findStudentsList();
    }

    @GetMapping("/wander/{name}")
    public Wander findWanderByName(@PathVariable String name) {
        return wanderService.findWanderByName(name);
    }
}