package com.pootuti.integrador.service.trainings;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pootuti.integrador.models.trainings.Training;
import com.pootuti.integrador.repository.trainings.TrainingRepository;

@Service
public class TrainingService implements ITrainingService {

    private TrainingRepository trainingRepository;
    
    @Override
    public void deleteTraining(Long idTraining) {
        trainingRepository.deleteById(idTraining);
    }

    @Override
    public Training findTraining(Long idTraining) {
        Training findedTraining = trainingRepository.findById(idTraining).orElse(null);
        return findedTraining;
    }

    @Override
    public List<Training> getTrainings() {
        return trainingRepository.findAll();
    }

    @Override
    public void saveTraining(Training training) {
        trainingRepository.save(training);
        
    }

    
    
}
