package POO.P202.services;

import POO.P202.entities.Point;

import java.util.Scanner;

public class PointService {
    Scanner scanner = new Scanner(System.in);

    public Point createPoint() {
        Point point = new Point();

        System.out.println("PUNTO 1 (x1,y1):");
        System.out.print("Ingrese x1: ");
        point.setX1(scanner.nextFloat());
        System.out.print("Ingrese y1: ");
        point.setY1(scanner.nextFloat());
        System.out.println("PUNTO 2 (x2,y2):");
        System.out.print("Ingrese x2: ");
        point.setX2(scanner.nextFloat());
        System.out.print("Ingrese y2: ");
        point.setY2(scanner.nextFloat());

        return point;
    }

    public double calculateDistance(Point point) {
        double difSquareX = Math.pow(point.getX2() - point.getX1(), 2);
        double difSquareY = Math.pow(point.getY2() - point.getY1(), 2);

        return Math.sqrt(difSquareX + difSquareY);
    }
}
