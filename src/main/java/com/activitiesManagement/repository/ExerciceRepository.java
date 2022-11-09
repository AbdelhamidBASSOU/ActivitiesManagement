package com.activitiesManagement.repository;

import com.activitiesManagement.entity.Exercise;

import java.util.List;

public interface ExerciceRepository {

    List< Exercise > getAll();
    void add(Exercise exercice);
}
