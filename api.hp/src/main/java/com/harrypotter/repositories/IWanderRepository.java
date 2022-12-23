package com.harrypotter.repositories;

import com.harrypotter.entities.Wander;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IWanderRepository extends JpaRepository<Wander,Integer> {
    @Query(value = "SELECT * FROM wander WHERE name = name", nativeQuery = true)
    public Wander findByName(String name);
}
