package com.luv2code.springboot.cruddemo.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.luv2code.springboot.cruddemo.dao.EmployeeDAO;
import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {
        Employee employee =  employeeService.findById(employeeId);
        if(employee == null){
            throw new RuntimeException("Employee with id " + employeeId + " not found");
        }
        return employee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee) {
        theEmployee.setId(0);
        Employee employeeDB = employeeService.save(theEmployee);
        return employeeDB;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee) {
        Employee  employeeDB = employeeService.save(theEmployee);
        return employeeDB;
    }

    @PatchMapping("/employees/{employeeId}")
    public Employee patchEmployee(@RequestBody Map<String, Object> patchPayLoad, @PathVariable int employeeId) {
        // find the employee

        Employee tempEmployee = employeeService.findById(employeeId);
        if(tempEmployee == null){
            throw new RuntimeException("Employee with id " + employeeId + " not found");
        }

        if(patchPayLoad.containsKey("id")){
            throw new RuntimeException("The Id is not allowed for Patch operation ");
        }

        // update the employee
        Employee updatedEmployee = apply(patchPayLoad, tempEmployee);


        // save to database
        Employee employeeDB = employeeService.save(updatedEmployee);

        // return the employee
        return employeeDB;
    }

    private Employee apply(Map<String, Object> patchPayLoad, Employee employee) {
        ObjectMapper mapper = new ObjectMapper();



    }
}
