package com.harrypotter.services;

import com.harrypotter.entities.Wander;
import com.harrypotter.repositories.IWanderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WanderService {

    @Autowired
    private IWanderRepository iWanderRepository;

    public List<Wander> findAll(){
        return iWanderRepository.findAll();
    }

    public Wander findWanderByName(String name) {
        return iWanderRepository.findWanderByName(name);
    }
}
