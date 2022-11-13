package com.activitiesManagement.dao;

import com.activitiesManagement.entity.Users;

import java.util.List;

public interface UserDao {
    Users add(Users u);
    List<Users> getAll();

    void update(Users user);
    void delete(int id);
}
