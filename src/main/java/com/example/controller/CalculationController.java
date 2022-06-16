package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {
    //Addition
    @RequestMapping ("/add")
     public String addition(){

         int a= 10;
         int b= 10;
         return " addition is  :" +(a+b);
     }
     //multiplication
    @RequestMapping ("/multi")
    public String multiplication(){

        int a= 23;
        int b= 10;
        return " multiplication is :" +(a*b);
    }
    // subtraction
    @RequestMapping ("/sub")
    public String subtraction (){
         int a= 50;
         int b= 25;
         return " subtraction is : "+(a-b);
    }
    //divide
    @RequestMapping("/div")
     public String divide(){
         int a= 100;
         int b= 10;
          return " divide is :"+(a/b);
     }


}
