package com.harrypotter.services;

import com.harrypotter.entities.SpecialObjects;
import com.harrypotter.repositories.ISpecialObjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialObjectsService {

    @Autowired
    private ISpecialObjectsRepository iSpecialObjectsRepository;

    public List<SpecialObjects> findAll(){
        return iSpecialObjectsRepository.findAll();
    }

}
