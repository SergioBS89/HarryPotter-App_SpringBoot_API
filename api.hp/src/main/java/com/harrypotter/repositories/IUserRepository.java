
package com.harrypotter.repositories;

import com.harrypotter.entities.House;
import com.harrypotter.entities.Wizard;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IUserRepository extends JpaRepository<Wizard,Integer>{
    
}