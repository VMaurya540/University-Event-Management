package com.university.UniversityEventManagement.controller;


import com.university.UniversityEventManagement.model.Student;
import com.university.UniversityEventManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/university-management")
public class StudentController {

@Autowired
    private StudentService studentService;

    public void StudentController(StudentService studentService){
        this.studentService=studentService;
    }

    //http://localhost:8080/api/v1/university-management/all-students
@GetMapping("/all-students")
    public List<Student>findAllStudent(){
return StudentService.findAllStudent();
}


// http://localhost:8080/api/v1/university-management/find-student/id/6
@GetMapping("/find-student/id/{id}")
    public Student findStudentById(@PathVariable int id){
        return studentService.findStudentById(id);
}

// http://localhost:8080/api/v1/university-management/add-student-details
@PostMapping("/add-student-details")
    public void addStudentDetails(@RequestBody Student student){
        StudentService.addStudentDetails(student);
}

// http://localhost:8080/api/v1/university-management/update-student-details/id/3
@PutMapping("/update-student-details/id/{id}")
    public Student updateStudentDetails(@PathVariable int id,@RequestBody Student student){
        studentService.updateStudentDetails(id,student);
    return student;
}


// http://localhost:8080/api/v1/university-management/delete-student-details/id/6
@DeleteMapping("/delete-student-details/id/{id}")
    public void deleteStudentDeails(@PathVariable int id){
        studentService.deleteStudentDetails(id);
}


}
