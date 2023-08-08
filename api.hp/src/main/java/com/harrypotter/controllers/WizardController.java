package com.harrypotter.controllers;

import java.util.List;

import com.harrypotter.entities.Wander;
import com.harrypotter.entities.Wizard;
import com.harrypotter.services.WanderService;
import com.harrypotter.services.WizardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/wizards")
public class WizardController {

    @Autowired
    private WizardService wizardService;
    @Autowired
    private WanderService wanderService;


    @GetMapping("/pages/{page}")
    public Page<Wizard> findAllSorted(@PathVariable Integer page) {
        return wizardService.findAllSorted(PageRequest.of(page, 8));
    }

    @GetMapping("/{name}")
    public Wizard findByName(@PathVariable String name) {
        return wizardService.findByName(name);
    }

    @GetMapping("/searching/{name}")
    public List<Wizard> findAllCoincidences(@PathVariable String name) {
        return wizardService.findAllCoincidences(name);
    }

    @GetMapping("/family/{name}")
    public List<Wizard> findFamilyByName(@PathVariable String name) {
        return wizardService.findFamilyByName(name);
    }

    @GetMapping("/mortifagos/{page}")
    public Page<Wizard> findMortifagosList(@PathVariable Integer page) {
        return wizardService.findMortifagosList(PageRequest.of(page, 8));
    }

    @GetMapping("/animals/{page}")
    public Page<Wizard> findAnimalsFantasticList(@PathVariable Integer page) {
        return wizardService.findAnimalsFantasticList(PageRequest.of(page, 8));
    }

    @GetMapping("/students/{page}")
    public Page<Wizard> findStudentsList(@PathVariable Integer page) {
        return wizardService.findStudentsList(PageRequest.of(page, 8));
    }

    @GetMapping("/wander/{name}")
    public Wander findWanderByName(@PathVariable String name) {
        return wanderService.findWanderByName(name);
    }

    @GetMapping("/teachers/{page}")
    public Page<Wizard> findTeacherList(@PathVariable Integer page) {
        return wizardService.findTeachersList(PageRequest.of(page, 8));
    }
    @GetMapping("/others/{page}")
    public Page<Wizard> findOthersList(@PathVariable Integer page) {
        return wizardService.findOthersList(PageRequest.of(page,8));
    }

}