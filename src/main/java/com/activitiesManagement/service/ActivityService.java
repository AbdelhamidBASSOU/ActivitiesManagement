package com.activitiesManagement.service;

import com.activitiesManagement.entity.Activity;


import java.util.List;

public interface ActivityService {
    List<Activity> getAll();
    void add(Activity activity);
    int count();
}
