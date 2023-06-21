
package com.harrypotter.repositories;

import com.harrypotter.entities.Family;
import com.harrypotter.entities.Wizard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface IFamilyRepository extends JpaRepository<Family,Integer>{

}