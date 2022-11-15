package com.activitiesManagement.repository.implementation;

import com.activitiesManagement.dao.ActivityDao;
import com.activitiesManagement.dao.implementation.ActivityDaoImpl;
import com.activitiesManagement.entity.Activity;
import com.activitiesManagement.repository.ActivityRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class ActivityRepositoryImpl implements ActivityRepository {
    ActivityDao activityDAO = new ActivityDaoImpl();

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager entityManager = emf.createEntityManager();

    @Override
    public List<Activity> getAll ( ) {
        return activityDAO.getAll ();
    }

    @Override
    public void add ( Activity activity ) {
        activityDAO.add(activity);
    }

    @Override
    public int count ( ) {
        Query query = entityManager.createQuery ( "SELECT COUNT(a) FROM Activity  a" );
        int count = Integer.parseInt ( String.valueOf ( query.getSingleResult () ) );
        return count;
    }
}
