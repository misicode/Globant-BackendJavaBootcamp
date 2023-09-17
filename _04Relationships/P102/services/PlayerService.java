package _04Relationships.P102.services;

import _04Relationships.P102.entities.Player;
import _04Relationships.P102.entities.WaterRevolver;

public class PlayerService {
    private static final WaterRevolverService waterRevolverService = new WaterRevolverService();

    public boolean shot(Player player, WaterRevolver waterRevolver) {
        System.out.println(waterRevolver);
        System.out.println("Apretando el gatillo...");
        if(waterRevolverService.wet(waterRevolver)) {
            player.setWet(true);
            System.out.println("El " + player.getName() + " se mojó");
            System.out.println("Fin del juego");
            return true;
        } else {
            waterRevolverService.nextShot(waterRevolver);
            System.out.println("El " + player.getName() + " no se mojó");
            System.out.println("Siguiente turno");
            return false;
        }
    }
}
