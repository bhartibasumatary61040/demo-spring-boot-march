package com.example.controller;

import com.example.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeController {

    ArrayList<Employee> employeeArrayList= new ArrayList<>();
    //create
    @RequestMapping("/add_emp")
    public String add(){
        Employee employee= new Employee("bharti",1,"CS");
        employeeArrayList.add(employee);
        return" employee added successfully";
    }
    //read
    @RequestMapping("/get_emplist")
    public ArrayList<Employee> getEmployeeArrayList(){
        return employeeArrayList;
    }
    //update
    @RequestMapping("/update_emp")
    public String update (){
        employeeArrayList.get(0).setName("JAVA");
        return" Name update successfully..";
    }
    //delete
     @RequestMapping("/delete_emp")
    public String delete(){
        employeeArrayList.remove(0);
        return" Employee deleted successfully,,";
    }
}
