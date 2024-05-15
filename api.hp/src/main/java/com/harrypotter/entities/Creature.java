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
public class Creature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String raze;
    private String resume;
    private String phrase;
    private String classification;
    private String danger; //To manage styles in front end
    private String picture;

    /**
     * Relation with Tags
     */
    @OneToMany(mappedBy = "ct")
    private Set<CreatureTag> tags = new HashSet<>();
}
