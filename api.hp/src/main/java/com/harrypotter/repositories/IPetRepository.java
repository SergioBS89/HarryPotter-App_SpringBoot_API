package com.harrypotter.repositories;

import com.harrypotter.entities.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IPetRepository extends JpaRepository<Pet,Integer> {
    @Query(value = "SELECT * FROM pet WHERE name = name", nativeQuery = true)
    public Pet findByName(String name);
}
