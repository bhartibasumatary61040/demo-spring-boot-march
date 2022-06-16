package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoController1 {

    @RequestMapping ("/test")
     public void message(){
         System.out.println("hello this is my second  project");
     }
     @RequestMapping ("/test2")
     public void read(){
         System.out.println(" you need to read this ");
     }

     @RequestMapping ("/int")
     public int  checkAge(){

        return 23;
     }

     @RequestMapping ("/double")
      public double salary2(){
        return 245.55;
      }


}
