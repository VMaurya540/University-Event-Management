package com.university.UniversityEventManagement.service;

import com.university.UniversityEventManagement.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private static List<Student> students = new ArrayList<>();

    private static int studentCount = 0;

    static {
        students.add(new Student(++studentCount, "Alok", "Maurya", 26, "EEE"));
        students.add(new Student(++studentCount, "Pratik", "Maurya", 25, "BCA"));
        students.add(new Student(++studentCount, "Nitin", "Gaur", 23, "CS"));
        students.add(new Student(++studentCount, "Poonam", "Patel", 22, "MBA"));
        students.add(new Student(++studentCount, "Vishal", "Maurya", 21, "MCA"));
    }

    public static List<Student> findAllStudent() {
        return students;
    }

    public static void addStudentDetails(Student student) {
        students.add(student);
    }


    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getStudentId() == id) {
                return student;
            }
        }
        return null;
    }

    public void updateStudentDetails(int id, Student student) {
        for (int i = 0; i < students.size(); i++) {
            Student student1 = students.get(i);
            if (student1.getStudentId() == id) {
                students.set(i, student);
                return;
            }
        }
    }


    public void deleteStudentDetails(int id) {
        for (int i = 0;i<students.size();i++){
            Student student = students.get(i);
            if (student.getStudentId()==id){
                students.remove(i);
                return;
            }
        }
    }
}
