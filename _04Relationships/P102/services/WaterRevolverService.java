package org.amincia._04Relationships.P102.services;

import org.amincia._04Relationships.P102.entities.WaterRevolver;

public class WaterRevolverService {
    public WaterRevolver fillRevolver() {
        int actualPosition = (int) (Math.random() * 10) + 1;
        int waterPosition = (int) (Math.random() * 10) + 1;

        return new WaterRevolver(actualPosition, waterPosition);
    }

    public boolean wet(WaterRevolver waterRevolver) {
        return waterRevolver.getActualPosition() == waterRevolver.getWaterPosition();
    }

    public void nextShot(WaterRevolver waterRevolver) {
        int nextPosition = waterRevolver.getActualPosition() + 1;

        if (nextPosition > 10) {
            waterRevolver.setActualPosition(1);
        } else {
            waterRevolver.setActualPosition(nextPosition);
        }
    }
}
