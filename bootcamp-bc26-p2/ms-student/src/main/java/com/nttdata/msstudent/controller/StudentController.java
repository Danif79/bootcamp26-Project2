package com.nttdata.msstudent.controller;

import com.nttdata.msstudent.model.Student;
import com.nttdata.msstudent.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Student> GetAllStudents(){
        return studentRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createStudent(@RequestBody Student student){
        studentRepository.save(student);
    }


}
