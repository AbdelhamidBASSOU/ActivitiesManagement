package com.activitiesManagement.service;

import com.activitiesManagement.entity.Activity;
import com.activitiesManagement.entity.Exercise;


import java.util.List;

public interface ActivityService {
    List<Activity> getAll();
    void add(Activity activity);
    int count();
    void delete(int id);
    void update(Activity activity);
}
