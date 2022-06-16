package com.example.controller;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeDBController {
    //create
    @Autowired
    EmployeeRepository repository;
   @RequestMapping(value= "/add_emp_db", method= RequestMethod.POST)
    public String add(@RequestBody Employee employee){
       repository.save(employee);
       return "Employee added to DB";

    }
    //get
    @RequestMapping(value="/get_emp_db", method= RequestMethod.GET)
    public List <Employee> getAll(){
     return repository.findAll();
    }
    //update

    //delete
    @RequestMapping(value="/delete_emp_db", method= RequestMethod.DELETE)
    public String delete(@RequestParam Integer id){
       repository.deleteById(id);
       return" Employee deleted successfully ...";

    }
}
