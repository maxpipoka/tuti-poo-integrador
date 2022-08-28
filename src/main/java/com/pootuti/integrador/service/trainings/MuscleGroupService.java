package com.pootuti.integrador.service.trainings;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pootuti.integrador.models.trainings.MuscleGroup;
import com.pootuti.integrador.repository.trainings.MuscleGroupRepository;

@Service
public class MuscleGroupService implements IMuscleGroupService{

    private MuscleGroupRepository muscleGroupRepository;

    @Override
    public void deleteMuscleGroup(Long idMuscleGroup) {
        muscleGroupRepository.deleteById(idMuscleGroup);
    }

    @Override
    public MuscleGroup findMuscleGroup(Long idMuscleGroup) {
        MuscleGroup findedMuscleGroup = muscleGroupRepository.findById(idMuscleGroup).orElse(null);
        return findedMuscleGroup;
    }

    @Override
    public List<MuscleGroup> getMuscleGroups() {
        return muscleGroupRepository.findAll();
    }

    @Override
    public void saveMuscleGroup(MuscleGroup muscleGroup) {
        muscleGroupRepository.save(muscleGroup);
        
    }
    
    
}
