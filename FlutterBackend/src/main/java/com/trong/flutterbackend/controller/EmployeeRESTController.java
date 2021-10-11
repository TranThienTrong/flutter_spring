package com.trong.flutterbackend.controller;

import com.trong.flutterbackend.entity.Employee;
import com.trong.flutterbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeRESTController {

    @Autowired
    private EmployeeRepository employeeRepository;

    /** @URL: http://localhost:8080/employees */
    @GetMapping(value = "/employees")
    public List<Employee> showAllRegister() {
        return employeeRepository.findAll();
    }

    /** @URL: http://localhost:8080/add */
    @PostMapping(value = "/add")
    public void addEmployee(Employee employee) {
        employeeRepository.addEmployee(employee);
    }
}
