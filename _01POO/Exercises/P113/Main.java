package org.amincia._01POO.Exercises.P113;

import org.amincia._01POO.Exercises.P113.entities.Course;
import org.amincia._01POO.Exercises.P113.services.CourseService;

public class Main {
    public static void main(String[] args) {
        CourseService courseService = new CourseService();
        Course course = courseService.createCourse();

        System.out.println(course);
        courseService.calculateWeeklyProfit(course);
    }
}
