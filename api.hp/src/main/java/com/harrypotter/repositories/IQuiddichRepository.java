package com.harrypotter.repositories;

import com.harrypotter.entities.QuiddichObjects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IQuiddichRepository extends JpaRepository<QuiddichObjects,Integer> {
}
