package com.pootuti.integrador.service.trainings;

import java.util.List;

import com.pootuti.integrador.models.trainings.TrainingWeek;

public interface ITrainingWeekService {

    public void saveTrainigWeek(TrainingWeek trainingWeek);

    public void deleteTrainingWeek(Long idTrainingWeek);

    public TrainingWeek findTrainingWeek(Long idTrainingWeek);

    public List<TrainingWeek> getTrainingWeeks();
    
}
