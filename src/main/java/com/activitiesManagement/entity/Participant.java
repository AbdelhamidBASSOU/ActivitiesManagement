package com.activitiesManagement.entity;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="participant")
public class Participant extends Users {

    @Column(name="domain", nullable = false)
    private String domain;

    @Column(name="structure" , nullable = false)
    private String structure;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }


}
