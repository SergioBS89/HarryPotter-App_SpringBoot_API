package com.harrypotter.services;

import com.harrypotter.entities.MaterialMagic;
import com.harrypotter.repositories.IMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService {

    @Autowired
    private IMaterialRepository iMaterialRepository;

    public List<MaterialMagic> findAll() {

        return iMaterialRepository.findAll();
    }
    }
