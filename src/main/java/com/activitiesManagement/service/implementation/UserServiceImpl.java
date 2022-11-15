package com.activitiesManagement.service.implementation;

import com.activitiesManagement.entity.Users;

import com.activitiesManagement.repository.UserRepository;
import com.activitiesManagement.repository.implementation.UserRepositoryImpl;
import com.activitiesManagement.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserRepository userRepo = new UserRepositoryImpl() ;
        @Override
        public Users add(Users user) {
            return userRepo.add(user);
        }

    @Override
    public Users login ( Users user ) {
        return userRepo.login(user);
    }

    @Override
    public List < Users > getAll ( ) {
        return userRepo.getAll();
    }

    @Override
    public void update ( Users user ) {
        userRepo.update(user);
    }

    @Override
    public void delete ( int id ) {
        userRepo.delete(id);
    }

    @Override
    public int count ( ) {
        return userRepo.count();
    }
}



