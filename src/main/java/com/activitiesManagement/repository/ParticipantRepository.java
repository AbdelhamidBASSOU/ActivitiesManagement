package com.activitiesManagement.repository;

import com.activitiesManagement.entity.Participant;


import java.util.List;

public interface ParticipantRepository {

    Participant add(Participant particiant);

    Participant login(Participant participant);

    List<Participant> getAll();

    void update(Participant participant);

    void delete (int id);
}
