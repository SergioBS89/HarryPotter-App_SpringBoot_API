package com.harrypotter.entities;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
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
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hogwarts_id", referencedColumnName = "id")
    private Hogwarts hogwarts;

    //Relation with hp world places
    @OneToMany(mappedBy = "wpl",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<PlacesAroundHPWorld> HPWorldPlacesList = new HashSet<>();
}
