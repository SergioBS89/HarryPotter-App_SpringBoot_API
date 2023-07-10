package com.harrypotter.services;

import com.harrypotter.entities.Creatures;
import com.harrypotter.entities.Horocruxes;
import com.harrypotter.repositories.ICreaturesRepository;
import com.harrypotter.repositories.IHorocruxesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HorocruxesService {

    @Autowired
    private IHorocruxesRepository iHorocruxesRepository;

    public Horocruxes findHorocruxesByName(String name){
        return iHorocruxesRepository.findByName(name);
    }

    public List<Horocruxes> findAll() {
        return iHorocruxesRepository.findAll();
    }
}
