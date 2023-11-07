package com.misicode._03Collections.Exercises.P103;

import com.misicode._03Collections.Exercises.P103.entities.Student;
import com.misicode._03Collections.Exercises.P103.services.StudentService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentsList = new ArrayList<>();
        StudentService studentService = new StudentService();

        studentService.addStudents(studentsList);
        studentService.calculateFinalGrade(studentsList);
    }
}
