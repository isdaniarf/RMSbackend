package com.isdaniar.rms.controller;

import com.isdaniar.rms.model.Employee;
import com.isdaniar.rms.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Isdaniar_F on 23/03/2017.
 */

@RestController
@RequestMapping("/app")
public class MainController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public @ResponseBody String addNewEmployee (@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return "Saved";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/batchAdd")
    public @ResponseBody String addNewEmployee (@RequestBody List<Employee> employees) {
        employees.forEach(employee -> employeeRepository.save(employee));
        return "Saved";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/search")
    public @ResponseBody Iterable<Employee> searchByName() {
        return employeeRepository.findAll();
    }
}
