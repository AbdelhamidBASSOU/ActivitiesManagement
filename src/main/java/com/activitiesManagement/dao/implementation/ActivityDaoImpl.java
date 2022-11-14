package com.activitiesManagement.dao.implementation;

import com.activitiesManagement.dao.ActivityDao;
import com.activitiesManagement.entity.Activity;
import com.activitiesManagement.entity.Exercise;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class ActivityDaoImpl implements ActivityDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager entityManager = emf.createEntityManager();
    @Override
    public List<Activity> getAll() {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery ( "SELECT a FROM Activity a" );
        List<Activity> activityList =  query.getResultList ();
        entityManager.getTransaction().commit();
        return activityList;
    }

    @Override
    public void add(Activity activity) {
        entityManager.getTransaction().begin();
        entityManager.persist ( activity );
        entityManager.getTransaction().commit();
    }
}
