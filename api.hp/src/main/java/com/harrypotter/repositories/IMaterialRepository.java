package com.harrypotter.repositories;

import com.harrypotter.entities.MaterialMagics;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IMaterialRepository extends JpaRepository<MaterialMagics,Integer> {
}
