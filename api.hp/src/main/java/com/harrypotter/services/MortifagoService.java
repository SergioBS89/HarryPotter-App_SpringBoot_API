package com.harrypotter.services;

import com.harrypotter.entities.Mortifagos;
import com.harrypotter.entities.Wizard;
import com.harrypotter.repositories.IMortifagoRepository;
import com.harrypotter.repositories.IWizardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MortifagoService {

    @Autowired
    private IMortifagoRepository iMortifagoRepository;

    public List<Mortifagos> findAll() {
        return iMortifagoRepository.findAll();
    }
/*    public Mortifagos findByID(Integer id){
        return iMortifagoRepository.findById(id).get();
    };
    public Mortifagos findByName(String name){
        return iMortifagoRepository.findByName(name);
    }*/
}