package com.activitiesManagement.service.implementation;

import com.activitiesManagement.entity.Exercise;
import com.activitiesManagement.repository.ExerciceRepository;
import com.activitiesManagement.repository.implementation.ExerciceRepositoryImp;
import com.activitiesManagement.service.ExerciceService;

import java.util.List;

public class ExerciceServiceImp implements ExerciceService {
    ExerciceRepository exerciceRepository = new ExerciceRepositoryImp ();

    @Override
    public List < Exercise > getAll ( ) {
        return exerciceRepository.getAll();
    }

    @Override
    public void add ( Exercise exercice ) {
        exerciceRepository.add(exercice);
    }

    @Override
    public void delete ( int id ) {
        exerciceRepository.delete(id);
    }
}
