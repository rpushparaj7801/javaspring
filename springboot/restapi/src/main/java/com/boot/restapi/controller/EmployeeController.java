package com.boot.restapi.controller;
import com.boot.restapi.entity.Employee;
import com.boot.restapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@Controller

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @PostMapping("/bulk")
    public List<Employee> saveEmployees(@RequestBody List<Employee> employees) {
        return employeeService.saveEmployees(employees);
    }

    @GetMapping("/employee/{id}")
    public Employee findById(@PathVariable int id) {
        return employeeService.findById(id);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteById(@PathVariable int id) {
        employeeService.deleteById(id);
    }

    @PutMapping("/employee/{id}")
    public Employee updateById(@PathVariable int id, @RequestBody Employee employee) {
        return employeeService.updateById(id, employee);
    }

    @GetMapping("/employee")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }


}
