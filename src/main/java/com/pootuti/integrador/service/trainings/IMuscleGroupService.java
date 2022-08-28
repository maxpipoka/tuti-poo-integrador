package com.pootuti.integrador.service.trainings;

import java.util.List;

import com.pootuti.integrador.models.trainings.MuscleGroup;

public interface IMuscleGroupService {
    
    public void saveMuscleGroup(MuscleGroup muscleGroup);

    public MuscleGroup findMuscleGroup(Long idMuscleGroup);

    public void deleteMuscleGroup(Long idMuscleGroup);

    public List<MuscleGroup> getMuscleGroups();
}
