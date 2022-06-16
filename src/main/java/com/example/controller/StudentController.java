package com.example.controller;

import com.example.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentController {
    ArrayList<Student> studentArrayList= new ArrayList<>();

    //Create
     @RequestMapping("/add_std")
    public String add (){
        Student student= new Student("rahul", 1,"A");
        studentArrayList.add(student);
        return" Student added successfully....";
    }
    //read
     @RequestMapping("/get_stdList")
    public ArrayList<Student> getStudentArrayList(){
         return studentArrayList;
    }
    //update
    @RequestMapping("/upd_std")
     public String update (){
         studentArrayList.get(0).setName("JAVA");
         return" Name updated successfully...";
     }

     //delete
    @RequestMapping("/delete_std")
     public String delete(){
         studentArrayList.remove(0);
         return"Student delete successfully,...";
     }


}
