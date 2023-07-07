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
    @Column(name = "home_address")
    private String homeAddress;
    private String profession;
    private String actor;
    private String housename;
    private String housecardpicture;
    private String houseurl;
    private String bibliography;
    private String picture;
    private String facemember;
    private String color;
    private String familyname;
    @JsonIgnore
    private boolean mortifago;
    @JsonIgnore
    private boolean auror;

//Relation with houses
    @ManyToOne
    @JoinColumn(name = "wizards_house")//Name of column (Remember to insert this column in sql)
    @JsonIgnore
    private House h;

    //Relation with teachers
    @ManyToOne
    @JoinColumn(name = "wizards_teachers")//Name of column (Remember to insert this column in sql)
    @JsonIgnore
    private House t;

}
