package com.esprit.testspring.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name="user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude={"id"},includeFieldNames= false)
public class User {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="email")
    private String email;
    @Column(name="pwd")
    private String pwd;
    @Column(name="fName")
    private String fName;
    @Column(name="IName")
    private String IName;
    @Enumerated(EnumType.STRING)
    private Role role ;

    @ManyToMany
    private Set<Projet> projets;


}
