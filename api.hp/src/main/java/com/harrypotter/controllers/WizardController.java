package com.harrypotter.controllers;

import java.util.List;

import com.harrypotter.entities.Wizard;
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

    @GetMapping("/pages/{page}")
    public Page<Wizard> findAllSorted(@PathVariable Integer page) {
        return wizardService.findAllSorted(PageRequest.of(page, 8));
    }

    @GetMapping("/{name}")
    public Wizard findByName(@PathVariable String name) {
        return wizardService.findByName(name);
    }

    @GetMapping("/search/{criteria}/{name}")
    public List<Wizard> searcherWizard(
            @PathVariable String criteria,
            @PathVariable String name){
        return switch (criteria) {
            case "searching" -> wizardService.findAllCoincidences(name);
            case "family" -> wizardService.findFamilyByName(name);
            default -> throw new IllegalArgumentException("Invalid criteria: " + criteria);
        };
    }

    @GetMapping("/{criteria}/{page}")
    public Page<Wizard> findByCriteria(
            @PathVariable String criteria,
            @PathVariable Integer page) {

        return switch (criteria) {
            case "mortifagos" -> wizardService.findMortifagosList(PageRequest.of(page, 8));
            case "animals" -> wizardService.findAnimalsFantasticList(PageRequest.of(page, 8));
            case "students" -> wizardService.findStudentsList(PageRequest.of(page, 8));
            case "teachers" -> wizardService.findTeachersList(PageRequest.of(page, 8));
            case "others" -> wizardService.findOthersList(PageRequest.of(page, 8));
            default -> throw new IllegalArgumentException("Invalid criteria: " + criteria);
        };
    }
}