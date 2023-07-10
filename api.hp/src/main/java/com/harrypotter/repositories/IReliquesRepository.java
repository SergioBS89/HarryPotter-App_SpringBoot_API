package com.harrypotter.repositories;

import com.harrypotter.entities.Horocruxes;
import com.harrypotter.entities.Reliques;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IReliquesRepository extends JpaRepository<Reliques,Integer> {
    @Query(value = "SELECT * FROM reliques WHERE name = :name", nativeQuery = true)
    public Reliques findReliquesByName(String name);

}
