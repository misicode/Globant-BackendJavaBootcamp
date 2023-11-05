package org.amincia._06JDBC;

import org.amincia._06JDBC.service.ManufacturerService;
import org.amincia._06JDBC.service.ProductService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\r?\n");
        ProductService productService = new ProductService();
        ManufacturerService manufacturerService = new ManufacturerService();
        int opt;

        do {
            System.out.println("========================================================");
            System.out.println("TIENDA");
            System.out.println("1. Listar el nombre de todos los productos");
            System.out.println("2. Lista los nombres y los precios de todos los productos");
            System.out.println("3. Listar los productos con precio entre 120 y 202");
            System.out.println("4. Buscar y listar todos los portátiles");
            System.out.println("5. Listar el nombre y precio del producto más barato");
            System.out.println("6. Ingresar un producto");
            System.out.println("7. Ingresar un fabricante");
            System.out.println("8. Editar un producto");
            System.out.println("0. Salir");
            System.out.println("========================================================");
            System.out.print("OPCIÓN: ");
            opt = scanner.nextInt();

            switch(opt) {
                case 1 -> {
                    System.out.println("\nNOMBRE DE TODOS LOS PRODUCTOS");
                    productService.listProductsByName();
                    System.out.println();
                }
                case 2 -> {
                    System.out.println("\nNOMBRE Y PRECIO DE TODOS LOS PRODUCTOS");
                    productService.listProductsByNameAndPrice();
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("\nPRODUCTOS CON PRECIO ENTRE 120 Y 202");
                    productService.listProductsWithPriceBetween120and202();
                    System.out.println();
                }
                case 4 -> {
                    System.out.println("\nPÓRTATILES");
                    productService.listLaptopsProducts();
                    System.out.println();
                }
                case 5 -> {
                    System.out.println("\nNOMBRE Y PRECIO DEL PRODUCTO MÁS BARATO");
                    productService.listMinPriceProduct();
                    System.out.println();
                }
                case 6 -> {
                    System.out.println("\nREGISTRAR PRODUCTO");
                    productService.saveProduct(productService.createProduct());
                    System.out.println();
                }
                case 7 -> {
                    System.out.println("\nREGISTRAR FABRICANTE");
                    manufacturerService.saveManufacturer(manufacturerService.createManufacturer());
                    System.out.println();
                }
                case 8 -> {
                    System.out.println("\nEDITAR PRODUCTO");
                    productService.saveProduct(productService.changeProduct());
                    System.out.println();
                }
            }
        } while(opt != 0);
    }
}
