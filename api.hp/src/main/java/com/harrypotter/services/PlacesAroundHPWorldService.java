package com.harrypotter.services;

import com.harrypotter.entities.Horocruxes;
import com.harrypotter.entities.PlacesAroundHPWorld;
import com.harrypotter.repositories.IHorocruxesRepository;
import com.harrypotter.repositories.IPlacesAroundHPWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlacesAroundHPWorldService {

    @Autowired
    private IPlacesAroundHPWorldService iPlacesAroundHPWorldService;

    public PlacesAroundHPWorld findByName(String name){
        return iPlacesAroundHPWorldService.findByName(name);
    }
    public List<PlacesAroundHPWorld> findAll() {
        return iPlacesAroundHPWorldService.findAll();
    }
}
