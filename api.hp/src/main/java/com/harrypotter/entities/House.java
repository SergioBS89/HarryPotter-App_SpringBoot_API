package com.harrypotter.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NotFound;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class House {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
//    @Column(name = "w")
//    private Integer wizardsHouse; //(This name has to be the same as mapped by

@ManyToMany(fetch = FetchType.LAZY, cascade = {
        CascadeType.PERSIST, CascadeType.MERGE
}, mappedBy = "houses")
//@JsonIgnore
private Set<Wizard> wizard = new HashSet<>();
}

//    private String surname;
//    private Integer age;
//    private String gender;
//    private String location;
//    private String profession;
//    private String picture;
//    @OneToMany(mappedBy = "wizardsHouse",cascade = CascadeType.ALL,orphanRemoval = true)
//    private List<Wizard> students;