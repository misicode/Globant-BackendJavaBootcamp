package org.amincia._01POO.P109;

import org.amincia._01POO.P109.entities.Mathematics;
import org.amincia._01POO.P109.services.MathematicsService;

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
