
package com.harrypotter.repositories;

import com.harrypotter.entities.Wizard;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IWizardRepository extends JpaRepository<Wizard,Integer>{
    
}