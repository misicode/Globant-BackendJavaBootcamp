package org.amincia._01POO.P113.services;

import org.amincia._01POO.P113.entities.Course;
import org.amincia._01POO.P113.entities.Student;
import org.amincia._01POO.P113.entities.Turn;

import java.util.Scanner;

public class CourseService {
    Scanner scanner = new Scanner(System.in).useDelimiter("\r?\n");

    public Course createCourse() {
        Course course = new Course();
        Turn turn;

        System.out.print("Ingrese el nombre: ");
        course.setName(scanner.nextLine());
        System.out.print("Ingrese las horas por día: ");
        course.setHoursPerDay(scanner.nextInt());
        System.out.print("Ingrese los días por semana: ");
        course.setDaysPerWeek(scanner.nextInt());
        do {
            System.out.print("Ingrese el turno (M-T): ");
            turn = validateTurn(scanner.next().toUpperCase());
        } while(turn == null);
        course.setTurn(turn);
        System.out.print("Ingrese el precio por hora: ");
        course.setPricePerHour(scanner.nextFloat());
        System.out.println("Ingrese los estudiantes:");
        course.setStudents(loadStudents());

        return course;
    }

    private Turn validateTurn(String character) {
        for(Turn turn: Turn.values()) {
            if(turn.name().equals(character)) {
                return turn;
            }
        }
        System.out.println("Carácter inválido!");
        return null;
    }

    public Student[] loadStudents() {
        Student[] students = new Student[5];

        for(int i = 0; i < 5; i++) {
            System.out.println("ESTUDIANTE " + (i+1));
            System.out.print("Ingrese el nombre: ");
            students[i] = new Student();
            students[i].setName(scanner.next());
        }

        return students;
    }

    public void calculateWeeklyProfit(Course course) {
        float profit = course.getPricePerHour() * course.getHoursPerDay() * course.getDaysPerWeek() * course.getStudents().length;
        System.out.println("La ganancia semanal es: S/" + profit);
    }
}
