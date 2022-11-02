package com.activitiesManagement.repository.implementation;

import com.activitiesManagement.dao.UserDao;
import com.activitiesManagement.dao.implementation.UserDaoImpl;
import com.activitiesManagement.entity.Users;
import com.activitiesManagement.repository.UserRepository;



public class        UserRepositoryImpl implements UserRepository{
    Users user =new Users();
    UserDao  userDao = new UserDaoImpl();
    @Override
    public Users add(Users user) {
        return userDao.add(user);
    }
}