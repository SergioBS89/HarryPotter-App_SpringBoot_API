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
    private String rol;
    private String actor;
    private String housename;
    private String picture;
    private String bibliography;
    private String facemember;
    private String color;
    private String familyname;
    private String blood;
    private String patronus;
    @Column(name = "wander_info")
    private String wanderInfo;
    private boolean mortifago;
    @Column(name = "animals_fantastics")
    private boolean animalsFantastics;
    private boolean student;
    private boolean others;
    private boolean teacher;

    @ManyToOne
    @JoinColumn(name = "wizards_wanders")//Name of column (Remember to insert this column in sql)
    private MagicObjects mw;

    @ManyToOne
    @JoinColumn(name = "wizards_objects")//Name of column (Remember to insert this column in sql)
    private MagicObjects mo;
}
