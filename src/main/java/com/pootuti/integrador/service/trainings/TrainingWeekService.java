package com.pootuti.integrador.service.trainings;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pootuti.integrador.models.trainings.TrainingWeek;
import com.pootuti.integrador.repository.trainings.TrainingWeekRepository;

@Service
public class TrainingWeekService implements ITrainingWeekService{

    private TrainingWeekRepository trainingWeekRepository;

    @Override
    public void deleteTrainingWeek(Long idTrainingWeek) {
        trainingWeekRepository.deleteById(idTrainingWeek);
    }

    @Override
    public TrainingWeek findTrainingWeek(Long idTrainingWeek) {
        TrainingWeek findedTrainingWeek = trainingWeekRepository.findById(idTrainingWeek).orElse(null);
        return findedTrainingWeek;
    }

    @Override
    public List<TrainingWeek> getTrainingWeeks() {
        return trainingWeekRepository.findAll();
    }

    @Override
    public void saveTrainigWeek(TrainingWeek trainingWeek) {
        trainingWeekRepository.save(trainingWeek);
    }
}
