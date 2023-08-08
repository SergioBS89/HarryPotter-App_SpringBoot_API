package com.harrypotter.services;

import com.harrypotter.entities.QuiddichObjects;
import com.harrypotter.repositories.IQuiddichRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuiddichService {

    @Autowired
    private IQuiddichRepository iQuiddichRepository;

    public List<QuiddichObjects> findAll() {
        return iQuiddichRepository.findAll();
    }
}
