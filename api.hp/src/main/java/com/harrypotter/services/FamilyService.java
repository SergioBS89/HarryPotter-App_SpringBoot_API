package com.harrypotter.services;

import com.harrypotter.entities.Family;
import com.harrypotter.entities.Wizard;
import com.harrypotter.repositories.IFamilyRepository;
import com.harrypotter.repositories.IWizardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyService {

    @Autowired
    private IFamilyRepository iFamilyRepository;

    public List<Family> findAll() {
        return iFamilyRepository.findAll();
    }
    public Family findByID(Integer id){
        return iFamilyRepository.findById(id).get();
    };
}