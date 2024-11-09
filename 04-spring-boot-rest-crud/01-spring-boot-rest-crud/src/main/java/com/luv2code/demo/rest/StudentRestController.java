package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    // define endpoint for "/students" - return a list fo students
    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> theStudents = new ArrayList<Student>();
        theStudents.add(new Student("Burnita", "Green"));
        theStudents.add(new Student("Beatrix", "Kiddo"));
        theStudents.add(new Student("Kill", "Bill"));
        return theStudents;
    }
}
