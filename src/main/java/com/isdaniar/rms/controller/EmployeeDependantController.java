package com.isdaniar.rms.controller;

import com.isdaniar.rms.model.Employee;
import com.isdaniar.rms.model.EmployeeDependant;
import com.isdaniar.rms.repository.EmployeeDependantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by isdaniarf on 3/28/2017.
 */

@RestController
@RequestMapping("/dependant")
public class EmployeeDependantController {

    @Autowired
    EmployeeDependantRepository dependantRepository;

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public @ResponseBody
    String addNewDependant (@RequestBody EmployeeDependant dependant) {
        dependantRepository.save(dependant);
        return "Saved";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<EmployeeDependant> getAllDependants() {
        return dependantRepository.findAll();
    }
}
