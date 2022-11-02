package com.activitiesManagement.service.implementation;

import com.activitiesManagement.entity.Users;

import com.activitiesManagement.repository.UserRepository;
import com.activitiesManagement.repository.implementation.UserRepositoryImpl;
import com.activitiesManagement.service.UserService;

public class UserServiceImpl implements UserService {
    UserRepository userRepo = new UserRepositoryImpl() ;
        @Override
        public Users add(Users user) {
            return userRepo.add(user);
        }
    }



