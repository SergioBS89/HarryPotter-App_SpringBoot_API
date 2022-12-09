package com.harrypotter.services;

import com.harrypotter.entities.House;
import com.harrypotter.entities.Wizard;
import com.harrypotter.repositories.IHouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseService {

    @Autowired
    private IHouseRepository houseRepository;

    public List<House> findAll(){
        return houseRepository.findAll();
    }
    public House findById(Integer id){return houseRepository.findById(id).get();
    }
}
