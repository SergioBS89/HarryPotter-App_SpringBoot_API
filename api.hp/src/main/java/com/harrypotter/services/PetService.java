package com.harrypotter.services;

import com.harrypotter.entities.Pet;
import com.harrypotter.entities.Wander;
import com.harrypotter.repositories.IPetRepository;
import com.harrypotter.repositories.IWanderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    @Autowired
    private IPetRepository iPetRepository;

    public List<Pet> findAll(){
        return iPetRepository.findAll();
    }
}
