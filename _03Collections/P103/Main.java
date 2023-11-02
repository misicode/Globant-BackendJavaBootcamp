package org.amincia._03Collections.P103;

import org.amincia._03Collections.P103.entities.Student;
import org.amincia._03Collections.P103.services.StudentService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentsList = new ArrayList<>();
        StudentService studentService = new StudentService();

        studentService.addStudents(studentsList);
        studentService.calculateFinalGrade(studentsList);
    }
}
