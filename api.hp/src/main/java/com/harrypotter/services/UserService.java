package com.harrypotter.services;

import java.util.List;


import com.harrypotter.entities.House;
import com.harrypotter.entities.Wizard;
import com.harrypotter.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private IUserRepository iUserRepository;

    public List<Wizard> findAll() {

        return iUserRepository.findAll();

    }

//    public House findById(Long id) {
//
//        Optional<House> opt = iUserRepository.findById(id);
//
//        if (opt.isEmpty()) {
//            return null;
//        } else {
//            return iUserRepository.findById(id).get();
//        }
//    }
//
//    public void updateUser(House wiz, Long id) {
//
//        wiz = iUserRepository.findById(id).get();
//
//        iUserRepository.save(wiz);
//
//    }
//
//    public void deleteUser(Long id) {
//
//        House u = iUserRepository.findById(id).get();
//        iUserRepository.delete(u);
//    }

}