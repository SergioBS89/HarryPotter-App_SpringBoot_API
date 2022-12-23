package com.harrypotter.repositories;

import com.harrypotter.entities.World;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IWorldRepository extends JpaRepository<World, Integer> {

}
