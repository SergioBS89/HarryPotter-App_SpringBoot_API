package com.harrypotter.repositories;

import com.harrypotter.entities.SpecialObjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ISpecialObjectsRepository extends JpaRepository<SpecialObjects,Integer> {

    @Query(value = "SELECT * FROM secret WHERE name = :name", nativeQuery = true)
    public SpecialObjects findByName(String name);
}
