package com.activitiesManagement.dao;

import com.activitiesManagement.entity.Activity;
import com.activitiesManagement.entity.Exercise;


import java.util.List;

public interface ActivityDao {
    List<Activity> getAll();
    void add(Activity activity);

    void delete(int id);
    void update(Activity activity);
}
