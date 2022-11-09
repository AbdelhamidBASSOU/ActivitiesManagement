package com.activitiesManagement.service;

import com.activitiesManagement.entity.Exercise;

import java.util.List;

public interface ExerciceService {

    List< Exercise > getAll();
    void add(Exercise exercice);

}
