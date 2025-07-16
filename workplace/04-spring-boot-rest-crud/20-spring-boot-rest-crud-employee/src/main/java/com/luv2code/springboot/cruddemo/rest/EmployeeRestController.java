package com.luv2code.springboot.cruddemo.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
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
    private ObjectMapper objectMapper;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService, ObjectMapper  objectMapper) {
        this.employeeService = employeeService;
        this.objectMapper = objectMapper;
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

    private Employee apply(Map<String, Object> patchPayLoad, Employee tempEmployee) {
        // convert tempEmployee to Object Node (JSON)
        ObjectNode employeeNode = objectMapper.convertValue(tempEmployee, ObjectNode.class);

        // convert patchPayload to Object Node (JSON)
        ObjectNode patchNode = objectMapper.convertValue(patchPayLoad, ObjectNode.class);
        // update the object node of employee from patch Node
        employeeNode.setAll(patchNode);
        // convert the employee node to employee object class
        Employee updatedEmployee = objectMapper.convertValue(employeeNode, Employee.class);
        // return the employee
        return updatedEmployee;
    }
}
