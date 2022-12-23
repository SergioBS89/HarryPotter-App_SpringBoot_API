package com.harrypotter.services;

import com.harrypotter.entities.Secret;
import com.harrypotter.repositories.ISecretRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecretService {

    @Autowired
    private ISecretRepository iSecretRepository;

    public List<Secret> findAll(){
        return iSecretRepository.findAll();
    }

}
