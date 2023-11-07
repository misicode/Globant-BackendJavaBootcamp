package com.misicode._01POO.Exercises.P114.services;

import com.misicode._01POO.Exercises.P114.entities.Mobile;

import java.util.Scanner;

public class MobileService {
    Scanner scanner = new Scanner(System.in);

    public Mobile createMobile() {
        Mobile mobile = new Mobile();

        System.out.print("Ingrese la marca: ");
        mobile.setMake(scanner.next());
        System.out.print("Ingrese el precio: ");
        mobile.setPrice(scanner.nextFloat());
        System.out.print("Ingrese el modelo: ");
        mobile.setModel(scanner.next());
        System.out.print("Ingrese la memoria RAM: ");
        mobile.setRam(scanner.nextInt());
        System.out.print("Ingrese el almacenamiento (GB): ");
        mobile.setStorage(scanner.nextInt());
        System.out.println("Ingrese el código de 7 dígitos:");
        mobile.setCode(createCode());

        return mobile;
    }

    private int[] createCode() {
        int[] code = new int[7];

        for(int i = 0; i < 7; i++) {
            System.out.print("Dígito " + (i+1) + ": ");
            code[i] = scanner.nextInt();
        }

        return code;
    }
}
