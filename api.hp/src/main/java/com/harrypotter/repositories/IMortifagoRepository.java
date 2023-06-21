
package com.harrypotter.repositories;

import com.harrypotter.entities.Mortifagos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface IMortifagoRepository extends JpaRepository<Mortifagos,Integer>{
/*
    @Query(value = "SELECT * FROM wizard WHERE name = :name", nativeQuery = true)
    public Mortifagos findByName(String name);*/
    
}