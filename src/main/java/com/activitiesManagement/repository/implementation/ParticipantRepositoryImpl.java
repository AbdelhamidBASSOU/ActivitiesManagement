package com.activitiesManagement.repository.implementation;

import com.activitiesManagement.dao.ParticipantDao;
import com.activitiesManagement.dao.implementation.ParticipantDaoImpl;
import com.activitiesManagement.entity.Participant;
import com.activitiesManagement.repository.ParticipantRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class ParticipantRepositoryImpl implements ParticipantRepository {
    Participant participant = new Participant();
    ParticipantDao participantDao = new ParticipantDaoImpl();

    @Override
    public Participant add(Participant participant) {
        return participantDao.add(participant);
    }

    @Override
    public Participant login ( Participant participant ) {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
            EntityManager entityManager = emf.createEntityManager();
            Query query = entityManager.createQuery ( "SELECT u FROM Participant  u WHERE u.username= :username" );
            query.setParameter("username", participant.getUsername ());
            participant = (Participant) query.getSingleResult ();
            return participant;
        } catch (Exception e){
            return null;
        }
    }

    @Override
    public List< Participant > getAll ( ) {
        return participantDao.getAll();
    }

    @Override
    public void update ( Participant participant ) {
        participantDao.update(participant);
    }

    @Override
    public void delete ( int id ) {
        participantDao.delete(id);
    }



}
