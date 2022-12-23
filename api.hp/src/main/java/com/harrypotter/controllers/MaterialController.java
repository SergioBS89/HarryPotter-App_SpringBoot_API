package com.harrypotter.controllers;

import com.harrypotter.entities.MaterialMagic;
import com.harrypotter.services.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/material")
public class MaterialController {

    @Autowired
    private MaterialService materialService;
    @GetMapping("")
    public List<MaterialMagic> findAllMaterial(){
        return materialService.findAll();
    }
}
