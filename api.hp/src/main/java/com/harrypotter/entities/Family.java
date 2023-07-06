package com.harrypotter.entities;

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
    public class Family {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String name;
        private String description;

    @OneToMany(mappedBy = "f",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Wizard> members = new HashSet<>();

    }

