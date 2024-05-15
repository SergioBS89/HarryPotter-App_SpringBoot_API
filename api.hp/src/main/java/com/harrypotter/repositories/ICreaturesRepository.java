package com.harrypotter.repositories;

import com.harrypotter.entities.Creature;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ICreaturesRepository extends JpaRepository<Creature, Integer>{

    @Query(value = "SELECT * FROM creatures order by raze ASC" , nativeQuery = true)
    public Page<Creature> findAll(Pageable pageable);

    @Query(value = "SELECT * FROM creatures WHERE danger = 'yes' order by raze ASC", nativeQuery = true)
    public Page<Creature> findDangerCreaturesList(Pageable page);

    @Query(value = "SELECT * FROM creatures WHERE danger = 'no' order by raze ASC", nativeQuery = true)
    public Page<Creature> findNoDangerCreaturesList(Pageable page);

    @Query(value = "SELECT * FROM creatures WHERE raze = :raze", nativeQuery = true)
    public Creature findByRaze(String raze);
}
