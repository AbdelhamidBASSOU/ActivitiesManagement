package com.activitiesManagement.repository.implementation;

import com.activitiesManagement.dao.ActivityDao;
import com.activitiesManagement.dao.implementation.ActivityDaoImpl;
import com.activitiesManagement.entity.Activity;
import com.activitiesManagement.entity.Exercise;
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

    @Override
    public void delete ( int id ) {
        System.out.println ("this is repository " + id );
        activityDAO.delete(id);
    }

    @Override
    public void update ( Activity activity ) {
        activityDAO.update(activity);
    }
}
