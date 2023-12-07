package com.esprit.testspring.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.mapping.Set;

import java.util.HashSet;

@Entity
@Table(name="projet")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude={"id"},includeFieldNames= false)
public class Projet {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="title")
    private String title;
    @Column(name="description")
    private String description;

    @OneToMany ( cascade = CascadeType.ALL, mappedBy = "projet")
    private Set sprints ;

    @ManyToMany(mappedBy = "projets")
    private java.util.Set<User> users;
}
