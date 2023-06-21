package com.harrypotter.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;
import java.util.stream.Stream;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "material_magic")
public class MaterialMagic{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String wanders;
    private String brooms;

    @Column(name = "special_objects")
    private String specialObjects;


//Relation with  pets
//    @OneToMany(mappedBy = "ms",cascade = CascadeType.ALL,orphanRemoval = true)
//    private Set<Pet> list_pets;
//
//    //Relation with  wanders
//    @OneToMany(mappedBy = "mw",cascade = CascadeType.ALL,orphanRemoval = true)
//    private Set<Wander> list_wanders;
//
//    //Relation with  broom
//    @OneToMany(mappedBy = "mb",cascade = CascadeType.ALL,orphanRemoval = true)
//    private Set<Broom> list_broom;

    //Relation with secret
//    @OneToMany(mappedBy = "ms",cascade = CascadeType.ALL,orphanRemoval = true)
//    private Set<SpecialObjects> list_secrets;

}
