package com.pootuti.integrador.controller.trainings;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pootuti.integrador.models.trainings.TrainingDay;
import com.pootuti.integrador.models.trainings.TrainingWeek;
import com.pootuti.integrador.service.trainings.ITrainingWeekService;

@RestController
public class TrainingWeekController {

    private ITrainingWeekService trainingWeekService;

    @GetMapping("/trainingweeks/get")
    public List<TrainingWeek> getTrainingWeeks(){
        return trainingWeekService.getTrainingWeeks();
    }

    @PostMapping("/trainingweeks/save")
    public void saveTrainingWeek(@RequestBody TrainingWeek trainingWeek){
        trainingWeekService.saveTrainingWeek(trainingWeek);
    }

    @DeleteMapping("/trainingweeks/delete/{idDelete}")
    public void deleteTrainigWeek(@PathVariable Long idDelete){
        trainingWeekService.deleteTrainingWeek(idDelete);
    }

    @GetMapping("/trainingweeks/search/{idSearch}")
    public TrainingWeek findTrainingWeek(@PathVariable Long idSearch){
        return trainingWeekService.findTrainingWeek(idSearch);
    }

    @PutMapping("/trainingweeks/edit/{idTrainingWeek}")
    public void editTrainingWeek(@PathVariable Long idTrainingWeek,
                                    @RequestParam("name") String newName,
                                    @RequestParam("trainingDays") List<TrainingDay> newTrainingDays){
        TrainingWeek trainingWeekToEdit = trainingWeekService.findTrainingWeek(idTrainingWeek);

        trainingWeekToEdit.setName(newName);
        trainingWeekToEdit.setTrainingDays(newTrainingDays);

        trainingWeekService.saveTrainingWeek(trainingWeekToEdit);
                                    }
    
}
