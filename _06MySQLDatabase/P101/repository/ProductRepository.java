package _06MySQLDatabase.repository;

import _06MySQLDatabase.model.Product;

import java.util.List;

public interface ProductRepository extends Repository<Product> {
    List<Product> findByPriceBetweenAnB(double a, double b);

    List<Product> findByName(String name);

    Product findMinPrice();
}
