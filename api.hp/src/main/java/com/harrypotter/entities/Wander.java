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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Wander {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    @Column(name = "made_with")
    private String madeWith;
    private String info;
    private String picture;

    //Relation with objects
    @ManyToOne
    @JoinColumn(name = "objects_wanders")//Name of column (Remember to insert this column in sql)
    @JsonIgnore
    private MagicObjects wl;

    //    Relation with Wizard
    @OneToMany(mappedBy = "sw",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Wizard> owner = new HashSet<>();
}
