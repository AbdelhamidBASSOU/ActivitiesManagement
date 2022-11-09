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
}
