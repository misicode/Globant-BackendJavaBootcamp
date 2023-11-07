package com.misicode._03Collections.Exercises.P106.services;

import java.util.HashMap;
import java.util.Scanner;

public class ProductService {
    Scanner scanner = new Scanner(System.in).useDelimiter("\r?\n");

    public void registerProduct(HashMap<String, Double> productsMap) {
        String name;
        double price;

        System.out.print("Ingrese el nombre del producto: ");
        name = scanner.next();
        System.out.print("Ingrese el precio del producto: ");
        price = scanner.nextDouble();

        productsMap.put(name, price);
    }

    public void modifyPrice(HashMap<String, Double> productsMap, String name, double newPrice) {
        if(productsMap.get(name) == null) {
            System.out.println("No existe un producto con ese nombre");
            return;
        }
        productsMap.put(name, newPrice);
    }

    public void deleteProduct(HashMap<String, Double> productsMap, String name) {
        if(productsMap.get(name) == null) {
            System.out.println("No existe un producto con ese nombre");
            return;
        }
        productsMap.remove(name);
    }

    public void listProducts(HashMap<String, Double> productsMap) {
        if(productsMap.isEmpty()) {
            System.out.println("La lista de productos está vacía");
            return;
        }

        for(String product: productsMap.keySet()) {
            System.out.println("Producto: " + product + ", Precio: S/" + productsMap.get(product));
        }
    }
}
