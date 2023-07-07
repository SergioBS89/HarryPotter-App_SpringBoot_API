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

    public List<Wizard> findFamilyByName(String name) {
        return iWizardRepository.findFamilyByName(name);
    }

    ;

    public Wizard findByName(String name) {
        return iWizardRepository.findByName(name);
    }

    public List<Wizard> findMortifagosList() {
        return iWizardRepository.findMortifagosList();
    }

    public List<Wizard> findAurorList() {
        return iWizardRepository.findAurorList();
    }

    public List<Wizard> findStudentsList() {
        return iWizardRepository.findStudentList();
    }
}