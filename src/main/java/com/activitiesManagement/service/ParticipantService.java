package com.activitiesManagement.service;

import com.activitiesManagement.entity.Participant;

import java.util.List;

public interface ParticipantService {
    Participant add(Participant p);
    Participant login(Participant participant);
    List<Participant> getAll();
    void update(Participant user);
    void delete(int id);
}
