package com.harrypotter.services;

import com.harrypotter.entities.MagicObjects;
import com.harrypotter.repositories.IMagicObjects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MagicObjectsService {

    @Autowired
    private IMagicObjects iMagicObjects;

    public List<MagicObjects> findAllObjects(){
        return iMagicObjects.findAll();
    }

}
