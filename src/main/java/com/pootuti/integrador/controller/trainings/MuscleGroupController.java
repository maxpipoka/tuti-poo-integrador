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

import com.pootuti.integrador.models.trainings.MuscleGroup;
import com.pootuti.integrador.service.trainings.IMuscleGroupService;

@RestController
public class MuscleGroupController {

    private IMuscleGroupService muscleGroupService;

    @GetMapping("/musclegroups/get")
    public List<MuscleGroup> getMuscleGroups(){
        return muscleGroupService.getMuscleGroups();
    }

    @PostMapping("/musclegroups/save")
    public void saveMuscleGroup(@RequestBody MuscleGroup muscleGroup){
        muscleGroupService.saveMuscleGroup(muscleGroup);
    }

    @DeleteMapping("/musclegroups/delete/{idDelete}")
    public void deleteMuscleGroup(@PathVariable Long idDelete){
        muscleGroupService.deleteMuscleGroup(idDelete);
    }

    @GetMapping("/musclegroups/search/{idSearch}")
        public MuscleGroup findMuscleGroup(@PathVariable Long idSearch){
            return muscleGroupService.findMuscleGroup(idSearch);
        }

    @PutMapping("/musclegroups/edit/{idMuscleGroup}")
    public void editMuscleGroup(@PathVariable Long idMuscleGroup,
                                @RequestParam("name") String newName){
        MuscleGroup muscleGroupToEdit = muscleGroupService.findMuscleGroup(idMuscleGroup);

        muscleGroupToEdit.setName(newName);

        muscleGroupService.saveMuscleGroup(muscleGroupToEdit);
    }
}
    

