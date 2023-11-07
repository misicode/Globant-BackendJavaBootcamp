package com.misicode._06JDBC.Exercise.service;

import com.misicode._06JDBC.Exercise.repository.ProductRepository;
import com.misicode._06JDBC.Exercise.repository.ProductRepositoryImpl;
import com.misicode._06JDBC.Exercise.entity.Product;

import java.util.Scanner;

public class ProductService {
    private final ProductRepository productRepository = new ProductRepositoryImpl();
    Scanner scanner = new Scanner(System.in).useDelimiter("\r?\n");

    public void listProductsByName() {
        productRepository.findAll().forEach(p -> System.out.println(p.getCode() + " -> " + p.getName()));
    }

    public void listProductsByNameAndPrice() {
        productRepository.findAll().forEach(p -> System.out.println(
                p.getCode() + " -> " + p.getName() + " | " + p.getPrice()));
    }

    public void listProductsWithPriceBetween120and202() {
        productRepository.findByPriceBetweenAnB(120, 202).forEach(p -> System.out.println(
                p.getCode() + " -> " + p.getName() + " | " + p.getPrice()));
    }

    public void listLaptopsProducts() {
        productRepository.findByName("Portátil").forEach(p -> System.out.println(
                p.getCode() + " -> " + p.getName()));
    }

    public void listMinPriceProduct() {
        System.out.println(productRepository.findMinPrice());
    }

    public void saveProduct(Product product) {
        productRepository.save(product);
        System.out.println("Se registró/actualizó el producto: " + product.getName());
    }

    public Product createProduct() {
        Product product = new Product();

        System.out.print("Ingrese el nombre del producto: ");
        product.setName(scanner.next());
        System.out.print("Ingrese el precio del producto: ");
        product.setPrice(scanner.nextDouble());
        System.out.print("Ingrese el código de fabricante: ");
        product.setCodeManufacturer(scanner.nextInt());

        return product;
    }

    public Product changeProduct() {
        Product product = new Product();

        System.out.print("Ingrese el ID del producto: ");
        product.setCode(scanner.nextInt());
        System.out.print("Ingrese el nuevo nombre: ");
        product.setName(scanner.next());
        System.out.print("Ingrese el nuevo precio: ");
        product.setPrice(scanner.nextDouble());

        return product;
    }
}
