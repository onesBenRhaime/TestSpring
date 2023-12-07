package com.esprit.testspring.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

public class Sprint {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="description")
    private String description;
    @Column(name="startDate")
    private Data startDate;

    @ManyToOne
     Projet projet;
}
