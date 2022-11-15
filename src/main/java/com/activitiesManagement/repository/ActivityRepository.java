package com.activitiesManagement.repository;

import com.activitiesManagement.entity.Activity;

import java.util.List;

public interface ActivityRepository {

    List<Activity> getAll();
    void add(Activity activity);
    int count();

    void delete(int id);
    void update(Activity activity);
}
