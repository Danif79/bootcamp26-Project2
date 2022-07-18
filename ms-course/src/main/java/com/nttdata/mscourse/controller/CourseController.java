package com.nttdata.mscourse.controller;

import com.nttdata.mscourse.model.Course;
import com.nttdata.mscourse.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Course> GetAllCourses(){
        return courseRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createCourse(@RequestBody Course course){
        courseRepository.save(course);
    }
}
