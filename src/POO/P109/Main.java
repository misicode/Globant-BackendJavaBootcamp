package POO.P109;

import POO.P109.entities.Mathematics;
import POO.P109.services.MathematicsService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathematicsService mathematicsService = new MathematicsService();
        Mathematics mathematics = mathematicsService.createMathematics();

        System.out.println(mathematics);
        mathematicsService.returnMayor(mathematics);
        mathematicsService.calculatePow(mathematics);
        mathematicsService.calculateSquareRoot(mathematics);
    }
}
