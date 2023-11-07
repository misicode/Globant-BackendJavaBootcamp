package com.misicode._06JDBC.Exercise.repository;

import com.misicode._06JDBC.Exercise.entity.Product;

import java.util.List;

public interface ProductRepository extends Repository<Product> {
    List<Product> findByPriceBetweenAnB(double a, double b);

    List<Product> findByName(String name);

    Product findMinPrice();
}
