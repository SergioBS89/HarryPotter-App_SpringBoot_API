
package com.harrypotter.repositories;

import com.harrypotter.entities.House;
import com.harrypotter.entities.Wizard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface IHouseRepository extends JpaRepository<House,Integer>{

}