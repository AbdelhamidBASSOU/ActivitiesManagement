package com.activitiesManagement.repository;

import com.activitiesManagement.entity.Users;

public interface UserRepository {

    Users add(Users user);
    Users login(Users user);

}
