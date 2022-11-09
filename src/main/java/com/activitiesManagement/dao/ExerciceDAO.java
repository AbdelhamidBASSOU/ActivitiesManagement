package com.activitiesManagement.dao;

import com.activitiesManagement.entity.Exercise;
import java.util.List;

public interface ExerciceDAO {

    List<Exercise> getAll();
    void add(Exercise exercice);
}
