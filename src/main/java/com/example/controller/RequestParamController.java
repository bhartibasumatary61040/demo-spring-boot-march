package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {
    @RequestMapping("/Request_Param_Message")
    public String hello(@RequestParam String name){
        return" welcome to request param";
    }
    @RequestMapping("/Request_param_Marks")
    public String Marks(@RequestParam int marks){
        if(marks>75){
            return" marks is good";
        }else
            return"marks is average";
    }
    @RequestMapping("/Request_Param_Age")
     public String Age( @RequestParam int age ){
        if(age>18){
             return" Eligible for voting";
        }else
            return"Not eligible for voting";
     }


}
