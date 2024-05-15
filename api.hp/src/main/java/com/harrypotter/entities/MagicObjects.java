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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "object")
public class MagicObjects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String info;
    private String picture;
    @Column(name = "is_horocruxe")
    private Boolean isHorocruxe;
    @Column(name = "is_hollow")
    private Boolean isDeathHollow;
    @Column(name = "is_wander")
    private Boolean isWander;
    @Column(name = "is_other")
    private Boolean isOtherMagicObject;
    private Boolean isQuiddich;

    //Relation with Wizard
    @OneToMany(mappedBy = "mo",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Wizard> ownerWander = new HashSet<>();

    //Relation with Wizard
    @OneToMany(mappedBy = "mo",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Wizard> ownerMagicObject = new HashSet<>();
}
