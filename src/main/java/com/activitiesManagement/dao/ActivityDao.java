package com.activitiesManagement.dao;

import com.activitiesManagement.entity.Activity;


import java.util.List;

public interface ActivityDao {
    List<Activity> getAll();
    void add(Activity activity);
}
