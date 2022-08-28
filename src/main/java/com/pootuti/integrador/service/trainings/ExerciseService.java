package com.pootuti.integrador.service.trainings;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pootuti.integrador.models.trainings.Exercise;
import com.pootuti.integrador.repository.trainings.ExerciseRepository;

@Service
public class ExerciseService implements IExerciseService{

    private ExerciseRepository exerciseRepository;

    @Override
    public void deleteExercise(Long idExercise) {
        exerciseRepository.deleteById(idExercise);
    }

    @Override
    public Exercise findExercise(Long idExercise) {
        Exercise findedExercise = exerciseRepository.findById(idExercise).orElse(null);
        return findedExercise;
    }

    @Override
    public List<Exercise> getExercises() {
        return exerciseRepository.findAll();
    }

    @Override
    public void saveExercise(Exercise exercise) {
        exerciseRepository.save(exercise);
        
    }

    
    
}
