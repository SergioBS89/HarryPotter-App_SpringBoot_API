package com.harrypotter.repositories;

import com.harrypotter.entities.Secret;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ISecretRepository extends JpaRepository<Secret,Integer> {
    @Query(value = "SELECT * FROM secret WHERE name = name", nativeQuery = true)
    public Secret findByName(String name);
}
