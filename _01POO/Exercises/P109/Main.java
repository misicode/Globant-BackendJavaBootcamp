package com.misicode._01POO.Exercises.P109;

import com.misicode._01POO.Exercises.P109.entities.Mathematics;
import com.misicode._01POO.Exercises.P109.services.MathematicsService;

public class Main {
    public static void main(String[] args) {
        MathematicsService mathematicsService = new MathematicsService();
        Mathematics mathematics = mathematicsService.createMathematics();

        System.out.println(mathematics);
        mathematicsService.returnMayor(mathematics);
        mathematicsService.calculatePow(mathematics);
        mathematicsService.calculateSquareRoot(mathematics);
    }
}
