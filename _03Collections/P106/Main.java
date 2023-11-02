package org.amincia._03Collections.P106;

import org.amincia._03Collections.P106.services.ProductService;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> productsMap = new HashMap<>();
        ProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in).useDelimiter("\r?\n");
        int opt;

        do {
            System.out.println("===================================");
            System.out.println("MENÚ DE PRODUCTOS");
            System.out.println("1. Registrar un producto");
            System.out.println("2. Modificar el precio de un producto");
            System.out.println("3. Eliminar un producto");
            System.out.println("4. Mostrar todos los productos");
            System.out.println("0. Salir");
            System.out.println("===================================");
            System.out.print("OPCIÓN: ");
            opt = scanner.nextInt();

            switch(opt) {
                case 1 -> {
                    System.out.println("REGISTRAR PRODUCTO");
                    productService.registerProduct(productsMap);
                }
                case 2 -> {
                    System.out.println("MODIFICAR PRECIO");
                    System.out.print("Ingrese el nombre del producto: ");
                    String name = scanner.next();
                    System.out.print("Ingrese el nuevo precio: ");
                    double price = scanner.nextDouble();
                    productService.modifyPrice(productsMap, name, price);
                }
                case 3 -> {
                    System.out.println("ELIMINAR PRODUCTO");
                    System.out.print("Ingrese el nombre del producto: ");
                    productService.deleteProduct(productsMap, scanner.next());
                }
                case 4 -> {
                    System.out.println("LISTAR PRODUCTOS");
                    productService.listProducts(productsMap);
                }
            }
        } while(opt != 0);
    }
}
