package com.harrypotter.repositories;

import com.harrypotter.entities.HogwartsPlaces;
import com.harrypotter.entities.PlacesAroundHPWorld;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IHogwartsPlacesService extends JpaRepository<HogwartsPlaces,Integer> {

    @Query(value = "SELECT * FROM hogwarts_places WHERE name = :name", nativeQuery = true)
    public HogwartsPlaces findByName(String name);
}
