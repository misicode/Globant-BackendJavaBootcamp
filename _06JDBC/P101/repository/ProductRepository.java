package _06JDBC.repository;

import _06JDBC.model.Product;

import java.util.List;

public interface ProductRepository extends Repository<Product> {
    List<Product> findByPriceBetweenAnB(double a, double b);

    List<Product> findByName(String name);

    Product findMinPrice();
}
