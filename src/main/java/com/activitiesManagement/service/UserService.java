package com.activitiesManagement.service;

import com.activitiesManagement.entity.Users;
import java.util.ArrayList;
import java.util.List;

public interface UserService {

            Users add(Users u);
    Users login(Users user);
    List<Users> getAll();
    void update(Users user);
    void delete(int id);

}
