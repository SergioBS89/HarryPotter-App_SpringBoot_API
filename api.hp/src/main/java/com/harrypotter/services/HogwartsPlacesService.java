package com.harrypotter.services;

import com.harrypotter.entities.HogwartsPlaces;
import com.harrypotter.entities.PlacesAroundHPWorld;
import com.harrypotter.repositories.IHogwartsPlacesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HogwartsPlacesService {

    @Autowired
    private IHogwartsPlacesService iHogwartsPlacesService;

    public HogwartsPlaces findByName(String name){
        return iHogwartsPlacesService.findByName(name);
    }
    public List<HogwartsPlaces> findAll() {
        return iHogwartsPlacesService.findAll();
    }
}
