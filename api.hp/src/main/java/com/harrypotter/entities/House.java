package com.harrypotter.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String name;
    private String info;
    private String phrase;
    @Column(name = "who_said_phrase")
    private String whoSaidPhrase;
    private String picture;

    //Relation with Hogwarts
    @ManyToOne
    @JoinColumn(name = "house_hogwarts")//Name of column (Remember to insert this column in sql)
    @JsonIgnore
    private Hogwarts hh;

//    Realtion with Wizard
    @OneToMany(mappedBy = "h",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Wizard> students = new HashSet<>();
}


