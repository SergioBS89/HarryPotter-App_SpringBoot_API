package com.harrypotter.services;

import com.harrypotter.entities.World;
import com.harrypotter.repositories.IWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorldService {
    @Autowired
    private IWorldRepository iWorldRepository;

    public List<World> show(){
        return  iWorldRepository.findAll();
    };

}
