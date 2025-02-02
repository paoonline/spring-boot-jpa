package com.pao.spring_data_jpa_ex.controller;

import com.pao.spring_data_jpa_ex.model.Student;
import com.pao.spring_data_jpa_ex.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "http://localhost:8080")
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("/")
    public List<Student> getStudents() {
        return service.getStudents();
    }

    @GetMapping("/{postId}")
    public Student findByStudents(@PathVariable("postId") int id) {
        return service.findByRollNo(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") int id) {
        return service.deleteStudent(id);
    }

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        service.addStudent(student);
        return service.getStudent(student.getRollNo());
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        service.updateStudent(student);
        return service.getStudent(student.getRollNo());
    }


}
