package com.thoughtworks.capability.gtb.entrancequiz.api;
import com.thoughtworks.capability.gtb.entrancequiz.dto.Student;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/student/list")
    public List<Student> getStudentList(){
        return studentService.getStudentList();
    }

    @PostMapping("/student/add")
    public void addOneStudent(@RequestBody Student student){
        studentService.addOneStudent(student);
    }

    @PostMapping("/student/group")
    public void getGroups(){

    }
}
