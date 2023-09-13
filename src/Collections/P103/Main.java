package Collections.P103;

import Collections.P103.entities.Student;
import Collections.P103.services.StudentService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentsList = new ArrayList<Student>();
        StudentService studentService = new StudentService();

        studentService.addStudents(studentsList);
        studentService.calculateFinalGrade(studentsList);
    }
}
