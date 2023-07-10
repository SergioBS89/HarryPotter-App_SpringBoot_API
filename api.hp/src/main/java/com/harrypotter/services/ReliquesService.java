package com.harrypotter.services;

import com.harrypotter.entities.Horocruxes;
import com.harrypotter.entities.Reliques;
import com.harrypotter.repositories.IHorocruxesRepository;
import com.harrypotter.repositories.IReliquesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReliquesService {

    @Autowired
    private IReliquesRepository iReliquesRepository;

    public List<Reliques> findAllReliquesList(){
        return iReliquesRepository.findAll();
    }

    public Reliques findReliquesByName(String name) {
        return iReliquesRepository.findReliquesByName(name);
    }
}
