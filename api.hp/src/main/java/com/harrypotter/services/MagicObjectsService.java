package com.harrypotter.services;

import com.harrypotter.entities.MagicObjects;
import com.harrypotter.repositories.IMagicObjects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MagicObjectsService {

    @Autowired
    private IMagicObjects iMagicObjects;

    public Page<MagicObjects> findAllObjects(Pageable pageable){
        return iMagicObjects.findAll(pageable);
    }

    public MagicObjects findByName(String name) {
        return iMagicObjects.findByName(name);
    }

    public Page<MagicObjects> findHorocruxesList(Pageable pageable){
        return iMagicObjects.findHorocruxesList(pageable);
    }

    public Page<MagicObjects> findWandersList(Pageable pageable){
        return iMagicObjects.findWanderList(pageable);
    }

    public Page<MagicObjects> findHollows(Pageable pageable){
        return iMagicObjects.findHollowList(pageable);
    }

    public Page<MagicObjects> findOthersObjects(Pageable pageable){
        return iMagicObjects.findOthersObjectsList(pageable);
    }

    public Page<MagicObjects> findQuddichObjects(Pageable pageable){
        return iMagicObjects.findQuddichObjectsList(pageable);
    }

}
