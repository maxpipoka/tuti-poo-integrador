package com.pootuti.integrador.controller.trainings;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pootuti.integrador.models.basic.Customer;
import com.pootuti.integrador.models.basic.Tutor;
import com.pootuti.integrador.models.trainings.Training;
import com.pootuti.integrador.models.trainings.TrainingWeek;
import com.pootuti.integrador.service.trainings.ITrainingService;

@RestController
public class TrainingController {

    private ITrainingService trainingService;

    @GetMapping("/trainings/get")
    public List<Training> getTrainings(){
        return trainingService.getTrainings();
    }

    @PutMapping("/trainigs/save")
    public void saveTrainig(@RequestBody Training training){
        trainingService.saveTraining(training);
    }

    @DeleteMapping("/trainigs/delete/{idDelete}")
    public void deleteTraining(@PathVariable Long idDelete){
        trainingService.deleteTraining(idDelete);
    }

    @GetMapping("/trainigs/search/{idSearch}")
    public Training findTraining(@PathVariable Long idSearch){
        return trainingService.findTraining(idSearch);
    }

    @PutMapping("/trainigs/edit/{idTrainign}")
    public void editTraining(@PathVariable Long idTraining,
                                @RequestParam("name") String newName,
                                @RequestParam("customer") Customer newCustomer,
                                @RequestParam("tutor") Tutor newTutor,
                                @RequestParam("startWeek") Long newStartWeek,
                                @RequestParam("trainingWeek") List<TrainingWeek> newTrainingWeek){

        Training trainingToEdit = trainingService.findTraining(idTraining);

        trainingToEdit.setName(newName);
        trainingToEdit.setCustomer(newCustomer);
        trainingToEdit.setTutor(newTutor);
        trainingToEdit.setStartWeek(newStartWeek);
        trainingToEdit.setTrainingWeek(newTrainingWeek);

        trainingService.saveTraining(trainingToEdit);
        }
    
}
