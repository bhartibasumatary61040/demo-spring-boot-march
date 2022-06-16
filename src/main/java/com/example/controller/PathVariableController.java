package com.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {

    @RequestMapping("/msg/{name}")
    public String hello(@PathVariable String name) {
        return " welcome to path variable " + name;
    }

    @RequestMapping("/ageCheck/{age}")
    public String ageCheck(@PathVariable int age) {
        if (age > 18) {
            return "Eligible for voting";

        } else {
            return " Not eligible for voting";
        }
    }

    @RequestMapping("/checkMarks/{marks}")
    public String checkMarks(@PathVariable int marks) {
        if (marks > 50) {
            return " your marks is good";
        } else {
            return " your marks is not good";
        }
    }
    @RequestMapping("/checkSalary/{salary}")
    public String checkSalary(@PathVariable double salary) {
        if (salary > 50000) {
            return " Your package is good";
        } else {
            return " Your package is average";
        }
    }
}

