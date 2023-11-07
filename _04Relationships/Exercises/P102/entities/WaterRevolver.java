package com.misicode._04Relationships.Exercises.P102.entities;

public class WaterRevolver {
    private int actualPosition;
    private int waterPosition;

    public WaterRevolver() {}

    public WaterRevolver(int actualPosition, int waterPosition) {
        this.actualPosition = actualPosition;
        this.waterPosition = waterPosition;
    }

    public int getActualPosition() {
        return actualPosition;
    }

    public void setActualPosition(int actualPosition) {
        this.actualPosition = actualPosition;
    }

    public int getWaterPosition() {
        return waterPosition;
    }

    public void setWaterPosition(int waterPosition) {
        this.waterPosition = waterPosition;
    }

    @Override
    public String toString() {
        return "\nREVÓLVER DE AGUA:" +
                "\nPosición actual: " + actualPosition +
                "\nPosición del agua: " + waterPosition;
    }
}
