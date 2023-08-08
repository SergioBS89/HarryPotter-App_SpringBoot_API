package com.harrypotter.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Creatures {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String raze;
    private String resume;
    private String phrase;
    private String life;
    private String clasification;
    private boolean danger;
    private String picture;

    @OneToMany(mappedBy = "ct")
    private Set<SpecialTags> tags = new HashSet<>();
}
