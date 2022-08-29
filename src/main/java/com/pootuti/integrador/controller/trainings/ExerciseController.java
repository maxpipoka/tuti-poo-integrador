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
import com.pootuti.integrador.models.trainings.MuscleGroup;
import com.pootuti.integrador.service.trainings.IExerciseService;

@RestController
public class ExerciseController {

    private IExerciseService exerciseService;

    @GetMapping("/exercises/get")
    public List<Exercise> getExercises(){
        return exerciseService.getExercises();
    }

    @PostMapping("/exercises/save")
    public void saveExercise(@RequestBody Exercise exercise){
        exerciseService.saveExercise(exercise);
    }

    @DeleteMapping("/exercises/delete/{idDelete}")
    public void deleteExercise(@PathVariable Long idDelete){
        exerciseService.deleteExercise(idDelete);
    }

    @GetMapping("/exercises/search/{idSearch}")
    public Exercise findExercise(@PathVariable Long idSearch){
        return exerciseService.findExercise(idSearch);
    }

    @PutMapping("/exercises/edit/{idExercise}")
    public void editExercise(@PathVariable Long idExercise,
                                @RequestParam("name") String newName,
                                @RequestParam("muscleGroup") MuscleGroup newMuscleGroup,
                                @RequestParam("series") Long newSeries,
                                @RequestParam("repetitions") Long newRepetitions,
                                @RequestParam("weight") Long newWeight){
        Exercise exerciseToEdit = exerciseService.findExercise(idExercise);
        
        exerciseToEdit.setName(newName);
        exerciseToEdit.setMuscleGroup(newMuscleGroup);
        exerciseToEdit.setSeries(newSeries);
        exerciseToEdit.setRepetitions(newRepetitions);
        exerciseToEdit.setWeight(newWeight);

        exerciseService.saveExercise(exerciseToEdit);
    }
}
