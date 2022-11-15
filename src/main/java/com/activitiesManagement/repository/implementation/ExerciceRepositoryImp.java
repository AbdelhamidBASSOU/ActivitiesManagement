package com.activitiesManagement.repository.implementation;

import com.activitiesManagement.dao.ExerciceDAO;
import com.activitiesManagement.dao.implementation.ExerciceDAOImp;
import com.activitiesManagement.entity.Exercise;
import com.activitiesManagement.repository.ExerciceRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class ExerciceRepositoryImp implements ExerciceRepository {
    ExerciceDAO exerciceDAO = new ExerciceDAOImp ();

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager entityManager = emf.createEntityManager();

    @Override
    public List < Exercise > getAll ( ) {
        return exerciceDAO.getAll ();
    }

    @Override
    public void add ( Exercise exercice ) {
        exerciceDAO.add(exercice);
    }

    @Override
    public void delete ( int id ) {
        System.out.println ("this is repository " + id );
        exerciceDAO.delete(id);
    }

    @Override
    public void update ( Exercise exercise ) {
        exerciceDAO.update(exercise);
    }

    @Override
    public int count ( ) {
        Query query = entityManager.createQuery ( "SELECT COUNT(e) FROM Exercise e" );
        int count = Integer.parseInt ( String.valueOf ( query.getSingleResult () ) );
        return count;
    }
}
