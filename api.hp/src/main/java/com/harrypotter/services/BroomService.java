package com.harrypotter.services;

import com.harrypotter.entities.Broom;
import com.harrypotter.entities.Wander;
import com.harrypotter.repositories.IBroomRepository;
import com.harrypotter.repositories.IWanderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BroomService {

    @Autowired
    private IBroomRepository iBroomRepository;

    public List<Broom> findAll(){
        return iBroomRepository.findAll();
    }
}
