package com.harrypotter.repositories;

import com.harrypotter.entities.MaterialMagic;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IMaterialRepository extends JpaRepository<MaterialMagic,Integer> {
}
