package POO.P113;

import POO.P113.entities.Course;
import POO.P113.services.CourseService;

public class Main {
    public static void main(String[] args) {
        CourseService courseService = new CourseService();
        Course course = courseService.createCourse();

        System.out.println(course);
        courseService.calculateWeeklyProfit(course);
    }
}
