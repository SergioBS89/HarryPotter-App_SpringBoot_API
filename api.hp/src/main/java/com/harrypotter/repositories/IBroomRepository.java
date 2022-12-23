package com.harrypotter.repositories;

import com.harrypotter.entities.Broom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IBroomRepository extends JpaRepository<Broom, Integer>{

    @Query(value = "SELECT * FROM broom WHERE name = name", nativeQuery = true)
    public Broom findByName(String name);
}
