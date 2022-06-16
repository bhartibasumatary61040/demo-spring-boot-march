package com.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalPathVariableController {
    @RequestMapping("/Add/{a}/{b}")
     public String Add(@PathVariable int a,@PathVariable int b){
         return" Addition is :"+(a+b);
     }
     @RequestMapping("/Sub/{a}/{b}")
      public String Sub(@PathVariable int a, @PathVariable int b){
         return" subtraction is :"+(a-b);
      }
      @RequestMapping("/Multi/{a}/{b}")
       public String Multi(@PathVariable int a, @PathVariable int b){
        return" Multiplication is :"+(a*b);
       }
       @RequestMapping("/Division/{a}/{b}")
        public String Division(@PathVariable int a, @PathVariable int b){
         return" division is "+(a/b);
        }
        @RequestMapping("/Request_Param_Addi")
         public String Addi(@RequestParam int a, @RequestParam int b){
      return" Addition is :"+(a+b);
         }

}
