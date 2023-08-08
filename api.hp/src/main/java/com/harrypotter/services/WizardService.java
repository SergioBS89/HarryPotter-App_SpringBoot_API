package com.harrypotter.services;

import java.util.List;


import com.harrypotter.entities.Wizard;
import com.harrypotter.repositories.IWizardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class WizardService {

    @Autowired
    private IWizardRepository iWizardRepository;

    public Page<Wizard> findAllSorted(Pageable pageable) {
        return iWizardRepository.findAllSorted(pageable);
    }

    public List<Wizard> findFamilyByName(String name) {
        return iWizardRepository.findFamilyByName(name);
    }

    public Wizard findByName(String name) {
        return iWizardRepository.findByName(name);
    }

    public List<Wizard> findAllCoincidences(String name) {
        return iWizardRepository.findAllCoincidences(name);
    }

    public Page<Wizard> findMortifagosList(Pageable pageable) {
        return iWizardRepository.findMortifagosList(pageable);
    }

    public Page<Wizard> findAnimalsFantasticList(Pageable pageable) {
        return iWizardRepository.findAnimalsFantasticList(pageable);
    }

    public Page<Wizard> findStudentsList(Pageable pageable) {
        return iWizardRepository.findStudentList(pageable);
    }

    public Page<Wizard> findTeachersList(Pageable pageable) {
        return iWizardRepository.findTeachersList(pageable);

    } public Page<Wizard> findOthersList(Pageable pageable) {
        return iWizardRepository.findOthersList(pageable);
    }
}