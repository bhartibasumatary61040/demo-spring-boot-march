package com.example.service;

import com.example.model.Employee;
import com.example.model.Student;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class DBService {
    @Autowired
    EmployeeRepository repository;
    public String add (Employee employee) {
        repository.save(employee);
        return " Employee added to DB";

    }
    }
