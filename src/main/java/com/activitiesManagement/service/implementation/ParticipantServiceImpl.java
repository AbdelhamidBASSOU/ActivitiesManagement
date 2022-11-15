package com.activitiesManagement.service.implementation;

import com.activitiesManagement.entity.Participant;
import com.activitiesManagement.repository.ParticipantRepository;
import com.activitiesManagement.repository.implementation.ParticipantRepositoryImpl;
import com.activitiesManagement.service.ParticipantService;

import java.util.List;

public class ParticipantServiceImpl implements ParticipantService {
    ParticipantRepository participantRepo = new ParticipantRepositoryImpl();

    @Override
    public Participant add(Participant participant) {
        return participantRepo.add(participant);
    }

    @Override
    public Participant login ( Participant participant ) {
        return participantRepo.login(participant);
    }

    @Override
    public List < Participant > getAll ( ) {
        return participantRepo.getAll();
    }

    @Override
    public void update ( Participant participant ) {
        participantRepo.update(participant);
    }

    @Override
    public void delete ( int id ) {
        participantRepo.delete(id);
    }
}
