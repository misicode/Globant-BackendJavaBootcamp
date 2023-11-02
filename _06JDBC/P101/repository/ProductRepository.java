package org.amincia._06JDBC.P101.repository;

import org.amincia._06JDBC.P101.model.Product;

import java.util.List;

public interface ProductRepository extends Repository<Product> {
    List<Product> findByPriceBetweenAnB(double a, double b);

    List<Product> findByName(String name);

    Product findMinPrice();
}
