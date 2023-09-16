package _03Collections.P103.services;

import _03Collections.P103.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    Scanner scanner = new Scanner(System.in).useDelimiter("\r?\n");

    public Student createStudent() {
        ArrayList<Integer> gradesList = new ArrayList<>();
        Student student = new Student();

        System.out.print("Ingrese el nombre del alumno: ");
        student.setName(scanner.next());
        System.out.println("Ingrese las notas del alumno:");
        System.out.print("Nota 1: ");
        gradesList.add(scanner.nextInt());
        System.out.print("Nota 2: ");
        gradesList.add(scanner.nextInt());
        System.out.print("Nota 3: ");
        gradesList.add(scanner.nextInt());
        student.setGrades(gradesList);

        return student;
    }

    public void addStudents(ArrayList<Student> studentsList) {
        String resp;

        do {
            studentsList.add(createStudent());
            System.out.print("Desea agregar otro alumno a la lista (Y-N)? ");
            resp = scanner.next().toUpperCase();
        } while(resp.equals("Y"));
    }

    public Student searchStudent(ArrayList<Student> studentsList, String name) {
        for(Student student: studentsList) {
            if(student.getName().equals(name)) {
                return student;
            }
        }

        System.out.println("No se encontró al alumno " + name);
        return null;
    }

    public void calculateFinalGrade(ArrayList<Student> studentsList) {
        System.out.println("\nPROMEDIO DE NOTAS");
        System.out.print("Ingrese el nombre del alumno: ");
        Student student = searchStudent(studentsList, scanner.next());
        double finalGrade = 0;

        if(student != null) {
            for(Integer grade: student.getGrades()) {
                finalGrade += grade;
            }

            System.out.println("ESTUDIANTE: " + student.getName());
            System.out.println("Promedio final: " + Math.round((finalGrade / 3) * 100D) / 100D);
        }
    }
}
