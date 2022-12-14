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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<Participant> getParticipantList() {
        return participantList;
    }

    public void setParticipantList(List<Participant> participantList) {
        this.participantList = participantList;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

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
