package com.activitiesManagement.repository;

import com.activitiesManagement.entity.Users;

import java.util.List;

public interface UserRepository {

    Users add(Users user);
    Users login(Users user);

    List<Users> getAll();
    void update(Users user);
    void delete (int id);

}
