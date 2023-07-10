
package com.harrypotter.repositories;

import com.harrypotter.entities.Wizard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface IWizardRepository extends JpaRepository<Wizard,Integer>{

    @Query(value = "SELECT * FROM wizard WHERE name = :name", nativeQuery = true)
    public Wizard findByName(String name);

    @Query(value = "SELECT * FROM wizard WHERE familyname = :name", nativeQuery = true)
    public List<Wizard> findFamilyByName(String name);

    @Query(value = "SELECT * FROM wizard WHERE mortifago = true", nativeQuery = true)
    public List<Wizard> findMortifagosList();

    @Query(value = "SELECT * FROM wizard WHERE auror = true", nativeQuery = true)
    public List<Wizard> findAurorList();

    @Query(value = "SELECT * FROM wizard WHERE student = true", nativeQuery = true)
    public List<Wizard> findStudentList();

    @Query(value = "SELECT * FROM wizard WHERE wizards_teachers = 1", nativeQuery = true)
    public List<Wizard> findTeachersList();
    
}