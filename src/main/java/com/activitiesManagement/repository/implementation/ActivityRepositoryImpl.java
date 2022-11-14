package com.activitiesManagement.repository.implementation;

import com.activitiesManagement.dao.ActivityDao;
import com.activitiesManagement.dao.implementation.ActivityDaoImpl;
import com.activitiesManagement.entity.Activity;
import com.activitiesManagement.repository.ActivityRepository;

import java.util.List;

public class ActivityRepositoryImpl implements ActivityRepository {
    ActivityDao activityDAO = new ActivityDaoImpl();

    @Override
    public List<Activity> getAll ( ) {
        return activityDAO.getAll ();
    }

    @Override
    public void add ( Activity activity ) {
        activityDAO.add(activity);
    }
}
