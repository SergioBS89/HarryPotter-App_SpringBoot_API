package com.harrypotter.repositories;

import com.harrypotter.entities.Horocruxes;
import com.harrypotter.entities.Quiddich;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IQuiddichRepository extends JpaRepository<Quiddich,Integer> {
}
