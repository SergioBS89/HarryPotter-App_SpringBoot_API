
package com.harrypotter.repositories;

import com.harrypotter.entities.Place;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IPlaceRepository extends JpaRepository<Place,Integer>{

}