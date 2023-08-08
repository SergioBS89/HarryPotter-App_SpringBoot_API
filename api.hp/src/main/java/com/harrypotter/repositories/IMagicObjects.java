package com.harrypotter.repositories;

import com.harrypotter.entities.MagicObjects;
import com.harrypotter.entities.Wizard;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IMagicObjects extends JpaRepository<MagicObjects,Integer> {

    @Query(value = "SELECT * FROM object order by name ASC", nativeQuery = true)
    public List<MagicObjects> findAllSorted();
}
