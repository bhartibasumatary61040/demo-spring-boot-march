package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //ENDPOINT 1
    @RequestMapping("/hello")
    public void message() {
        System.out.println(" Hello, Welcome to my new project");
    }

    @RequestMapping("/message")
    public String hello() {
        return "this is my first project";
    }

    @RequestMapping("/age")
    public String checkAge() {

       return " please enter your age";
    }
    @RequestMapping ("/salary")
    public String salary(){

        return " please enter your salary";
    }
}


