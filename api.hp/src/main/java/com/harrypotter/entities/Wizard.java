package com.harrypotter.entities;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.lang.annotation.Repeatable;
import java.util.HashSet;
import java.util.Set;


@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Wizard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    @Column(name = "home_address")
    private String homeAddress;
    private String profession;
    private String actor;
    private String housename;
    private String houseurl;
    private String bibliography;
    private String picture;
    private String facemember;
    private String color;
    private String familyname;

//Relation with houses
    @ManyToOne
    @JoinColumn(name = "wizards_house")//Name of column (Remember to insert this column in sql)
    @JsonIgnore
    private House h;
//Relation with mortifagos
    @ManyToOne
    @JoinColumn(name = "wizards_mortifagos")//Name of column (Remember to insert this column in sql)
    @JsonIgnore
    private House m;
    //Relation with houses
    @ManyToOne
    @JoinColumn(name = "wizards_family")//Name of column (Remember to insert this column in sql)
    @JsonIgnore
    private House f;
}


//WIZARD

//    @JoinTable(name = "wizard_house", joinColumns = {
//            @JoinColumn(name = "house_id", referencedColumnName = "id") }, inverseJoinColumns = {
//            @JoinColumn(name = "wizard_id", referencedColumnName = "id")
//    })
//    @ManyToMany(fetch = FetchType.LAZY)
////    @JsonIgnore
//    private Set<House> houses = new HashSet<>();

//    @Column(name = "w")
//    private Integer wizardsHouse; //(This name has to be the same as mapped by

//HOUSE
//@ManyToMany(fetch = FetchType.LAZY, cascade = {
//        CascadeType.PERSIST, CascadeType.MERGE
//}, mappedBy = "houses")
////@JsonIgnore
//private Set<Wizard> wizard = new HashSet<>();