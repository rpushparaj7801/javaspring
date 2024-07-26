package com.boot.restapi.service;
import com.boot.restapi.entity.Employee;
import com.boot.restapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> saveEmployees(List<Employee> employees) {
        return employeeRepository.saveAll(employees);
    }


    public Employee findById(int id) {
        return employeeRepository.findById(id).get();
    }


    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }

    public Employee updateById(int id, Employee employee) {
        if (employeeRepository.existsById(id)) {
            employee.setId(id);
            return employeeRepository.save(employee);
        }
        return employee;
    }

    public List<Employee> findAll() {
      return   employeeRepository.findAll();
    }
}
