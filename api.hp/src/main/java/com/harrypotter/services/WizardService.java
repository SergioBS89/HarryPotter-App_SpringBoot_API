package com.harrypotter.services;

import java.util.List;


import com.harrypotter.entities.Wizard;
import com.harrypotter.repositories.IWizardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WizardService {

    @Autowired
    private IWizardRepository iWizardRepository;

    public List<Wizard> findAll() {
        return iWizardRepository.findAll();
    }
    public Wizard findByID(Integer id){
        return iWizardRepository.findById(id).get();
    };
    public Wizard findByName(String name){
        return iWizardRepository.findByName(name);
    }
}