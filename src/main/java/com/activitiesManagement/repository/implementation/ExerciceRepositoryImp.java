package com.activitiesManagement.repository.implementation;

import com.activitiesManagement.dao.ExerciceDAO;
import com.activitiesManagement.dao.implementation.ExerciceDAOImp;
import com.activitiesManagement.entity.Exercise;
import com.activitiesManagement.repository.ExerciceRepository;

import java.util.List;

public class ExerciceRepositoryImp implements ExerciceRepository {
    ExerciceDAO exerciceDAO = new ExerciceDAOImp ();

    @Override
    public List < Exercise > getAll ( ) {
        return exerciceDAO.getAll ();
    }

    @Override
    public void add ( Exercise exercice ) {
        exerciceDAO.add(exercice);
    }

    @Override
    public void delete ( int id ) {
        System.out.println ("this is repository " + id );
        exerciceDAO.delete(id);
    }

    @Override
    public void update ( Exercise exercise ) {
        exerciceDAO.update(exercise);
    }
}
