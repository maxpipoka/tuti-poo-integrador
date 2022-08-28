package com.pootuti.integrador.service.trainings;

import java.util.List;

import com.pootuti.integrador.models.trainings.Exercise;

public interface IExerciseService {

    public void saveExercise(Exercise exercise);

    public Exercise findExercise(Long idExercise);

    public void deleteExercise(Long idExercise);

    public List<Exercise> getExercises();
    
}
