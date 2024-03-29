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
public class Reliques {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String info;
    private String picture;

    //Relation with wizard
    @OneToMany(mappedBy = "re",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Wizard> owners_reliques = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "objects_reliques")//Name of column (Remember to insert this column in sql)
    @JsonIgnore
    private MagicObjects drl;
}
