package com.pootuti.integrador.service.trainings;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pootuti.integrador.models.trainings.TrainingDay;
import com.pootuti.integrador.repository.trainings.TrainingDayRepository;

@Service
public class TrainingDayService implements ITrainingDayService{

    private TrainingDayRepository trainingDayRepository;

    @Override
    public void deleteTrainingDay(Long idTrainingDay) {
        trainingDayRepository.deleteById(idTrainingDay);
    }

    @Override
    public TrainingDay findTrainingDay(Long idTrainingDay) {
        TrainingDay findedTraingDay = trainingDayRepository.findById(idTrainingDay).orElse(null);
        return findedTraingDay;
    }

    @Override
    public List<TrainingDay> getTrainingDays() {
        return trainingDayRepository.findAll();
    }

    @Override
    public void saveTrainingDay(TrainingDay trainingDay) {
        trainingDayRepository.save(trainingDay);
    }
    
    
}
