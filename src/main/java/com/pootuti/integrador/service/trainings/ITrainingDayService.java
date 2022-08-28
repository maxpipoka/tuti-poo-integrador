package com.pootuti.integrador.service.trainings;

import java.util.List;

import com.pootuti.integrador.models.trainings.TrainingDay;

public interface ITrainingDayService {

    public void saveTrainingDay(TrainingDay trainingDay);

    public void deleteTrainingDay(Long idTrainingDay);

    public TrainingDay findTrainingDay(Long idTrainingDay);

    public List<TrainingDay> getTrainingDays();
    
}
