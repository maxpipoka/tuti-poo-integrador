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

import com.pootuti.integrador.models.trainings.Exercise;
import com.pootuti.integrador.models.trainings.TrainingDay;
import com.pootuti.integrador.service.trainings.ITrainingDayService;

@RestController
public class TrainingDayController {

    private ITrainingDayService trainingDayService;

    @GetMapping("/trainingdays/get")
    public List<TrainingDay> getTrainingDays() {
        return trainingDayService.getTrainingDays();
    }

    @PostMapping("/trainindays/save")
    public void saveTrainingDay(@RequestBody TrainingDay trainingDay){
        trainingDayService.saveTrainingDay(trainingDay);
    }

    @DeleteMapping("/trainindays/delete/{idDelete}")
    public void deleteTrainingDay(@PathVariable Long idDelete){
        trainingDayService.deleteTrainingDay(idDelete);
    }

    @GetMapping("/trainindays/search/{idSearch}")
    public TrainingDay findTrainingDay(@PathVariable Long idSearch){
        return trainingDayService.findTrainingDay(idSearch);
    }

    @PutMapping("/trainingdays/edit/{idTrainingDay}")
    public void editTrainingDay(@PathVariable Long idTrainingDay,
                                @RequestParam("name") String newName,
                                @RequestParam("exercises") List<Exercise> newExercises){
        
        TrainingDay trainingDayToEdit = trainingDayService.findTrainingDay(idTrainingDay);

        trainingDayToEdit.setName(newName);
        trainingDayToEdit.setExercises(newExercises);

        trainingDayService.saveTrainingDay(trainingDayToEdit);
    }


    
}
