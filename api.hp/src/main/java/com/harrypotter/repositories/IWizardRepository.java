
package com.harrypotter.repositories;

import com.harrypotter.entities.Wizard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface IWizardRepository extends JpaRepository<Wizard,Integer>{

    @Query(value = "SELECT * FROM wizard WHERE name = :name", nativeQuery = true)
    public Wizard findByName(String name);
    
}