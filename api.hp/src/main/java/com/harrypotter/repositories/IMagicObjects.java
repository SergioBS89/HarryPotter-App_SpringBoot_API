package com.harrypotter.repositories;

import com.harrypotter.entities.MagicObjects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMagicObjects extends JpaRepository<MagicObjects,Integer> {

}
