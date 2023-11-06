package org.amincia._01POO.Exercises.P110.entities;

import java.util.Arrays;

public class OrderArrays {
    private double[] array1;
    private double[] array2;

    public OrderArrays() {}

    public OrderArrays(double[] array1, double[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public double[] getArray1() {
        return array1;
    }

    public void setArray1(double[] array1) {
        this.array1 = array1;
    }

    public double[] getArray2() {
        return array2;
    }

    public void setArray2(double[] array2) {
        this.array2 = array2;
    }

    @Override
    public String toString() {
        return "ARREGLOS:" +
                "\nArreglo 1: " + Arrays.toString(array1) +
                "\nArreglo 2: " + Arrays.toString(array2);
    }
}
