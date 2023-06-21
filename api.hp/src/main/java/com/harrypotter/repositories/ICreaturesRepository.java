package com.harrypotter.repositories;

import com.harrypotter.entities.Creatures;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICreaturesRepository extends JpaRepository<Creatures, Integer>{
}
