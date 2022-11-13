package com.activitiesManagement.dao.implementation;

import com.activitiesManagement.dao.ExerciceDAO;
import com.activitiesManagement.entity.Exercise;
import com.activitiesManagement.entity.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class ExerciceDAOImp implements ExerciceDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager entityManager = emf.createEntityManager();
    @Override
    public List < Exercise > getAll ( ) {

        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery ( "SELECT e FROM Exercise e" );
        List<Exercise> exerciseList =  query.getResultList ();
        entityManager.getTransaction().commit();
        return exerciseList;
    }
    @Override
    public void add ( Exercise exercice ) {
        entityManager.getTransaction().begin();
        entityManager.persist ( exercice );
        entityManager.getTransaction().commit();
    }

    @Override
    public void delete ( int id ) {
        Exercise exercice = entityManager.find(Exercise.class, id);

        entityManager.getTransaction().begin();
        entityManager.remove(exercice);
        entityManager.getTransaction().commit();
    }

    @Override
    public void update ( Exercise exercise ) {
        Exercise _exercise = entityManager.find(Exercise.class, exercise.getId ());

        entityManager.getTransaction().begin();
        _exercise.setYear (exercise.getYear ());
        _exercise.setDateStart ( exercise.getDateStart () );
        _exercise.setEndDate ( exercise.getEndDate () );
        _exercise.setState ( exercise.isState () );
        _exercise.setDescription ( exercise.getDescription () );
        entityManager.getTransaction().commit();
    }

}
