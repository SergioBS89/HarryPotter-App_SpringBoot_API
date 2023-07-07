package com.harrypotter.services;

import com.harrypotter.entities.Creatures;
import com.harrypotter.repositories.ICreaturesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreaturesService {

    @Autowired
    private ICreaturesRepository iCreaturesRepository;

    public List<Creatures> findDangerCreaturesList(){
        return iCreaturesRepository.findDangerCreaturesList();
    }

    public List<Creatures> findNoDangerCreaturesList(){
        return iCreaturesRepository.findNoDangerCreaturesList();
    }
}
