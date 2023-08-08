package com.harrypotter.services;

import com.harrypotter.entities.OtherMagicObjects;
import com.harrypotter.entities.QuiddichObjects;
import com.harrypotter.repositories.IOtherMagicObjects;
import com.harrypotter.repositories.IQuiddichRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OthersObjectsService {

    @Autowired
    private IOtherMagicObjects iOtherMagicObjects;

    public Page<OtherMagicObjects> findAll(Pageable page) {
        return iOtherMagicObjects.findAll(page);
    }
}
