package com.harrypotter.services;

import com.harrypotter.entities.Place;
import com.harrypotter.repositories.IPlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceService {

    @Autowired
    private IPlaceRepository iPlaceRepository;

    public List<Place> findAll() {
        return iPlaceRepository.findAll();
    }
}