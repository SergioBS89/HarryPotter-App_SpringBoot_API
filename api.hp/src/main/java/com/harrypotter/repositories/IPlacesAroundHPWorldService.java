package com.harrypotter.repositories;

import com.harrypotter.entities.PlacesAroundHPWorld;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IPlacesAroundHPWorldService extends JpaRepository<PlacesAroundHPWorld,Integer> {

    @Query(value = "SELECT * FROM places_around_hpworld WHERE name = :name", nativeQuery = true)
    public PlacesAroundHPWorld findByName(String name);
}
