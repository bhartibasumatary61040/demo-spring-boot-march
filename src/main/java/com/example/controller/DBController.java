package com.example.controller;

import com.example.model.Student;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class DBController {
    //create
    @Autowired
    StudentRepository repository;
    @RequestMapping(value= "/add_std_db", method = RequestMethod.POST)
    public String add (@RequestBody Student student){
        repository.save(student);
        return" Student added to DB";

    }
    //get
    @RequestMapping(value="get_std_db", method= RequestMethod.GET)
     public List<Student> getAll(){
         return repository.findAll();
     }
     //update
    /* public String update(@RequestParam String name, @RequestParam Integer id ){
        Optional<Student > student = repository.findById(id);
        student.get().setName(name);


     }*/

    //delete
    @RequestMapping(value="delete_std_db",method= RequestMethod.DELETE)
    public String delete(@RequestParam Integer id){
        repository.deleteById(id);
        return " Student deleted successfully ";

    }
}
