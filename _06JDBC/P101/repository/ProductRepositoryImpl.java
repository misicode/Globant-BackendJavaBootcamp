package org.amincia._06JDBC.P101.repository;

import org.amincia._06JDBC.P101.model.Product;
import org.amincia._06JDBC.P101.util.ConnectionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    private Connection getConnection() throws SQLException {
        return ConnectionDB.getInstance();
    }

    @Override
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();

        try (
                Statement stmt = getConnection().createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM product")
        ) {
            while(rs.next()) {
                products.add(createProduct(rs));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return products;
    }

    @Override
    public Product findById(int id) {
        try(
                PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM product WHERE prd_code = ?")
        ) {
            stmt.setInt(1, id);

            try(ResultSet rs = stmt.executeQuery()) {
                if(rs.next()) {
                    return createProduct(rs);
                }
            }
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    @Override
    public void save(Product product) {
        String query;

        if(product.getCode() > 0) {
            query = "UPDATE product SET prd_name = ?, prd_price = ? WHERE prd_code = ?";
        } else {
            query = "INSERT INTO product(prd_name, prd_price, prd_code_mnf) VALUES (?, ?, ?)";
        }

        try(
                PreparedStatement stmt = getConnection().prepareStatement(query)
        ) {
            stmt.setString(1, product.getName());
            stmt.setDouble(2, product.getPrice());

            if(product.getCode() > 0) {
                stmt.setInt(3, product.getCode());
            } else {
                stmt.setInt(3, product.getCodeManufacturer());
            }

            stmt.executeUpdate();
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        try(
                PreparedStatement stmt = getConnection().prepareStatement("DELETE FROM product WHERE prd_code = ?")
        ) {
            stmt.setInt(1, id);

            stmt.executeUpdate();
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Product> findByPriceBetweenAnB(double a, double b) {
        List<Product> products = new ArrayList<>();

        try(
                PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM product WHERE prd_price BETWEEN ? AND ?")
        ) {
            stmt.setDouble(1, a);
            stmt.setDouble(2, b);

            try(ResultSet rs = stmt.executeQuery()) {
                while(rs.next()) {
                    products.add(createProduct(rs));
                }
            }
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }

        return products;
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> products = new ArrayList<>();

        try(
                PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM product WHERE prd_name LIKE ?")
        ) {
            stmt.setString(1, '%' + name + '%');

            try(ResultSet rs = stmt.executeQuery()) {
                while(rs.next()) {
                    products.add(createProduct(rs));
                }
            }
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }

        return products;
    }

    @Override
    public Product findMinPrice() {
        try(
                Statement stmt = getConnection().createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM product ORDER BY prd_price ASC LIMIT 1")
        ) {
            if(rs.next()) {
                return createProduct(rs);
            }
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    private Product createProduct(ResultSet rs) throws SQLException {
        Product product = new Product();

        product.setCode(rs.getInt(1));
        product.setName(rs.getString(2));
        product.setPrice(rs.getDouble(3));
        product.setCodeManufacturer(rs.getInt(4));

        return product;
    }
}
