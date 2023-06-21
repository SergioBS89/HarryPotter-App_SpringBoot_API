package com.harrypotter.services;

import com.harrypotter.entities.Creatures;
import com.harrypotter.repositories.ICreaturesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreaturesService {

    @Autowired
    private ICreaturesRepository iServiceRepository;

    public List<Creatures> findAllCreatures(){
        return iServiceRepository.findAll();
    }
}
