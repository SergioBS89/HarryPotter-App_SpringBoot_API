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
@Table(name = "objects")
public class MagicObjects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //Relation with horocruxes
    @OneToMany(mappedBy = "hl")
    private Set<Horocruxes> horocruxesList;

    //Relation with reliques
    @OneToMany(mappedBy = "drl")
    private Set<Reliques> deathReliquesList;

    //Relation with wanders
    @OneToMany(mappedBy = "wl")
    private Set<Wander> wandersList;
}
