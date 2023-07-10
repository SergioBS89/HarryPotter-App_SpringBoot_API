package com.harrypotter.repositories;

import com.harrypotter.entities.Horocruxes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IHorocruxesRepository extends JpaRepository<Horocruxes,Integer> {
    @Query(value = "SELECT * FROM horocruxes WHERE name = :name", nativeQuery = true)
    public Horocruxes findByName(String name);

}
