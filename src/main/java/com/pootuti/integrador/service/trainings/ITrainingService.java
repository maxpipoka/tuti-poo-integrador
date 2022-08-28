package com.pootuti.integrador.service.trainings;

import java.util.List;

import com.pootuti.integrador.models.trainings.Training;

public interface ITrainingService {

    public void saveTraining(Training training);

    public Training findTraining(Long idTraining);

    public void deleteTraining(Long idTraining);

    public List<Training> getTrainings();
    
}
