package POO.P202;

import POO.P202.entities.Point;
import POO.P202.services.PointService;

public class Main {
    public static void main(String[] args) {
        PointService pointService = new PointService();
        Point point = pointService.createPoint();

        System.out.println(point);
        System.out.println("La distancia entre ambos puntos es: " + pointService.calculateDistance(point));
    }
}
