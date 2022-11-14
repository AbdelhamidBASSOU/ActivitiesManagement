package com.activitiesManagement.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity


public class Exercise implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Temporal(TemporalType.DATE)
    private String year;

    @Temporal(TemporalType.DATE)
    private LocalDate dateStart;




    //@Temporal(TemporalType.DATE)
    @Column(name = "endDate")
    private LocalDate endDate;

    //@Temporal(TemporalType.DATE)
    //private LocalDate endDate;


    @Column(name="state")
    private boolean state;

    @Column(name="description")
    private String description;


    public Exercise ( String year , LocalDate dateDebut , LocalDate dateFin , Boolean status , String description ) {
    }

    public String getDescription ( ) {
        return description;
    }

    public void setDescription ( String description ) {
        this.description = description;
    }

    public Exercise (String year , LocalDate dateStart , LocalDate endDate , boolean state , String description ) {
        this.year = year;
        this.dateStart = dateStart;
        this.endDate = endDate;
        this.state = state;
        this.description = description;
    }

    public Exercise ( Long id , String year , LocalDate dateStart , LocalDate endDate , boolean state , String description ) {
        this.id = id;
        this.year = year;
        this.dateStart = dateStart;
        this.endDate = endDate;
        this.state = state;
        this.description = description;
    }

    public Long getId ( ) {
        return id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Exercise ( String year , LocalDate dateStart , LocalDate endDate , boolean state ) {
        this.year = year;
        this.dateStart = dateStart;
        this.endDate = endDate;
        this.state = state;
    }

    public Exercise ( Long id ) {
        this.id = id;
    }

    @Override
    public String toString ( ) {
        return "Exercise{" +
                "id=" + id +
                ", year='" + year + '\'' +
                ", dateStart=" + dateStart +
                ", endDate=" + endDate +
                ", state=" + state +
                '}';

    }
}
