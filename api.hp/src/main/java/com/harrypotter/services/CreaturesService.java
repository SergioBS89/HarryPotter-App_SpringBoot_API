package com.harrypotter.services;

import com.harrypotter.entities.Creature;
import com.harrypotter.repositories.ICreaturesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CreaturesService {

    @Autowired
    private ICreaturesRepository iCreaturesRepository;

    /*TODO remove???*/
    public Page<Creature> findAll(Pageable pageable){
        return iCreaturesRepository.findAll(pageable);
    }

    public Page<Creature> findDangerCreaturesList(Pageable pageable){
        return iCreaturesRepository.findDangerCreaturesList(pageable);
    }

    public Page<Creature> findNoDangerCreaturesList(Pageable pageable){
        return iCreaturesRepository.findNoDangerCreaturesList(pageable);
    }

    public Creature findByRace(String raze){
        return iCreaturesRepository.findByRaze(raze);
    }
}
