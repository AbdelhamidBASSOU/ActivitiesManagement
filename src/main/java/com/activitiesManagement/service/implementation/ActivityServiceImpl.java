package com.activitiesManagement.service.implementation;

import com.activitiesManagement.entity.Activity;
import com.activitiesManagement.entity.Exercise;
import com.activitiesManagement.repository.ActivityRepository;
import com.activitiesManagement.repository.implementation.ActivityRepositoryImpl;
import com.activitiesManagement.service.ActivityService;

import java.util.List;

public class ActivityServiceImpl implements ActivityService {

    ActivityRepository activityRepository = new ActivityRepositoryImpl();

    @Override
    public List<Activity> getAll() {
        return  activityRepository.getAll();
    }

    @Override
    public void add(Activity activity) {
        activityRepository.add(activity);
    }

    @Override
<<<<<<< HEAD
    public int count ( ) {
        return activityRepository.count();
    }
=======
    public void delete ( int id ) {
        System.out.println ("this is service : " + id );
        activityRepository.delete(id);
    }

    @Override
    public void update ( Activity activity ) {
        activityRepository.update(activity);
    }

>>>>>>> develop
}
