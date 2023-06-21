package com.harrypotter.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SpecialObjects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    //Relation with horocruxes
    @OneToMany(mappedBy = "sh",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Horocruxes> list_horocruxes;

    //Relation with reliques
    @OneToMany(mappedBy = "sr",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Reliques> list_reliques;
}
