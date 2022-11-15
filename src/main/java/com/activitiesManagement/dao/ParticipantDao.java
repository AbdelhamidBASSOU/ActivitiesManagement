package com.activitiesManagement.dao;

import com.activitiesManagement.entity.Participant;

import java.util.List;

public interface ParticipantDao {
    Participant add(Participant p);

    List<Participant> getAll();

    void update(Participant participant);

    void delete(int id);
}
