package com.harrypotter.repositories;

import com.harrypotter.entities.Creatures;
import com.harrypotter.entities.Wizard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICreaturesRepository extends JpaRepository<Creatures, Integer>{

    @Query(value = "SELECT * FROM creatures WHERE danger = true", nativeQuery = true)
    public List<Creatures> findDangerCreaturesList();

    @Query(value = "SELECT * FROM creatures WHERE danger = false", nativeQuery = true)
    public List<Creatures> findNoDangerCreaturesList();
}
