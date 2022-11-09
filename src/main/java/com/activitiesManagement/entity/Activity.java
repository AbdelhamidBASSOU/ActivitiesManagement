package com.activitiesManagement.entity;

import jakarta.persistence.*;
import jakarta.servlet.http.Part;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Activity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name= "title", nullable = false)
    private String title;

    @Column(name= "description" , nullable = true)
    private String description;

    @Column(name= "dateDebut", nullable = false)
    private LocalDate dateDebut;

    @Column(name = "dateFin", nullable = true)
    private LocalDate dateFin;

    @Column(name = "status")
    private Boolean status;

    // Relationship
    @OneToMany
    private List<Participant> participantList = new ArrayList <> ();

    @OneToOne
    private Exercise exercise;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
