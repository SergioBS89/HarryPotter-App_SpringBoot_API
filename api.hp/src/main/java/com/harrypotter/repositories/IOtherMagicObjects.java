package com.harrypotter.repositories;

import com.harrypotter.entities.OtherMagicObjects;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IOtherMagicObjects extends JpaRepository<OtherMagicObjects,Integer> {

    @Query(value = "SELECT * FROM other_objects order by name ASC", nativeQuery = true)
    public Page<OtherMagicObjects> findAll(Pageable page);
}