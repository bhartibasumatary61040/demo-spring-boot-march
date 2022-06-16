package com.example.controller;

import com.example.model.Employee;
import com.example.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBEmployeeController {
    @Autowired
    DBService service;
    @RequestMapping( value="/add_employee_db", method= RequestMethod.POST)
     public String add(@RequestBody Employee employee){
         return service.add(employee);

     }
}
