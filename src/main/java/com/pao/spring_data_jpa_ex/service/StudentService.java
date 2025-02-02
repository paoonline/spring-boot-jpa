package com.pao.spring_data_jpa_ex.service;

import com.pao.spring_data_jpa_ex.model.Student;
import com.pao.spring_data_jpa_ex.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo repo;

    public void addStudent(Student a) {
        repo.save(a);
    }

    public void updateStudent(Student a) {
        repo.save(a);
    }

    public String deleteStudent(int id) {
        repo.deleteById(id);
        return "delete";
    }

    public Student findByRollNo(int id) {
        return repo.findByRollNo(id);
    }

    public Student getStudent(int postId) {
        return repo.findById(postId).orElse(new Student());
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}
