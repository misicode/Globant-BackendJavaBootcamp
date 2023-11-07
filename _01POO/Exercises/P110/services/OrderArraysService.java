package com.misicode._01POO.Exercises.P110.services;

import com.misicode._01POO.Exercises.P110.entities.OrderArrays;

import java.util.Arrays;

public class OrderArraysService {
    public OrderArrays createOrderArrays() {
        OrderArrays orderArrays = new OrderArrays();
        orderArrays.setArray1(createArr1());
        orderArrays.setArray2(createArr2(orderArrays.getArray1()));

        return orderArrays;
    }

    private double[] createArr1() {
        double[] arr1 = new double[50];

        for(int i = 0; i < 50; i++) {
            arr1[i] = Math.round(Math.random() * 10000.0) / 100.0;
        }

        return arr1;
    }

    private double[] orderArr(double[] arr) {
        double[] newArr = arr.clone();
        Arrays.sort(newArr);
        return newArr;
    }

    private double[] createArr2(double[] arr1) {
        double[] arr2 = new double[20];

        System.arraycopy(orderArr(arr1), 0, arr2, 0, 10);
        Arrays.fill(arr2, 10, 20, 0.5);

        return arr2;
    }
}
