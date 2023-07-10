package com.harrypotter.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Hogwarts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //Realtion with Place
    @JsonIgnore
    @OneToOne(mappedBy = "hogwarts")
    private Place place;

    //ORealtion with Quiddich
    @OneToOne(mappedBy = "hogwarts")
    private Quiddich quiddich;

    //Relation with teachers
    @OneToMany(mappedBy = "th",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Teacher> hogwartsTeacherList = new HashSet<>();

    //Relation with houses
    @OneToMany(mappedBy = "hh",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<House> hogwartsHousesList = new HashSet<>();

    //Relation with hogwarts places
    @OneToMany(mappedBy = "hp",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<HogwartsPlaces> hogwartsPlacesList = new HashSet<>();
}
