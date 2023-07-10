package com.harrypotter.services;

import com.harrypotter.entities.Horocruxes;
import com.harrypotter.entities.Quiddich;
import com.harrypotter.repositories.IHorocruxesRepository;
import com.harrypotter.repositories.IQuiddichRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuiddichService {

    @Autowired
    private IQuiddichRepository iQuiddichRepository;

    public List<Quiddich> findAll() {
        return iQuiddichRepository.findAll();
    }
}
