package com.activitiesManagement.entity;

import jakarta.persistence.*;


import java.time.LocalDate;
import java.util.Date;

@Entity
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    //@Temporal(TemporalType.DATE)
    @Column(name= "annee")
    private String year;

    //@Temporal(TemporalType.DATE)
    @Column(name = "dateStart")
    private LocalDate dateStart;

    public Exercise(Long id) {
        this.id = id;
    }

    //@Temporal(TemporalType.DATE)
    @Column(name = "endDate")
    private LocalDate endDate;

    @Column(name="state")
    private boolean state;

    public Long getId ( ) {
        return id;
    }

    public String getYear ( ) {
        return year;
    }

    public LocalDate getDateStart ( ) {
        return dateStart;
    }

    public LocalDate getEndDate ( ) {
        return endDate;
    }

    public boolean isState ( ) {
        return state;
    }

    public void setId ( Long id ) {
        this.id = id;
    }

    public void setYear ( String year ) {
        this.year = year;
    }

    public void setDateStart ( LocalDate dateStart ) {
        this.dateStart = dateStart;
    }

    public void setEndDate ( LocalDate endDate ) {
        this.endDate = endDate;
    }

    public void setState ( boolean state ) {
        this.state = state;
    }

    public Exercise ( ) {
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
