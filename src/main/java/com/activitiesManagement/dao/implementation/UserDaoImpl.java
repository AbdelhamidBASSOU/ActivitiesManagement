package com.activitiesManagement.dao.implementation;

import com.activitiesManagement.dao.UserDao;
import com.activitiesManagement.entity.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UserDaoImpl implements UserDao {
    @Override
    public Users add(Users u) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(u);
        entityManager.getTransaction().commit();
        entityManager.close();
        return u;
    }
}
