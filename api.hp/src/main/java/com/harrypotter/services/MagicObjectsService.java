package com.harrypotter.services;

import com.harrypotter.entities.MagicObjects;
import com.harrypotter.repositories.IMagicObjects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MagicObjectsService {

    @Autowired
    private IMagicObjects iMagicObjects;

    public List<MagicObjects> findAll(){
        return iMagicObjects.findAll();
    }

}
