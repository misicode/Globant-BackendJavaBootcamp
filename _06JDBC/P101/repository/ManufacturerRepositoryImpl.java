package _06JDBC.P101.repository;

import _06JDBC.P101.model.Manufacturer;
import _06JDBC.P101.util.ConnectionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ManufacturerRepositoryImpl implements Repository<Manufacturer> {
    private Connection getConnection() throws SQLException {
        return ConnectionDB.getInstance();
    }

    @Override
    public List<Manufacturer> findAll() {
        List<Manufacturer> manufacturers = new ArrayList<>();

        try (
                Statement stmt = getConnection().createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM manufacturer")
        ) {
            while(rs.next()) {
                manufacturers.add(createManufacturer(rs));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return manufacturers;
    }

    @Override
    public Manufacturer findById(int id) {
        try(
                PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM manufacturer WHERE mnf_code = ?")
        ) {
            stmt.setInt(1, id);

            try(ResultSet rs = stmt.executeQuery()) {
                if(rs.next()) {
                    return createManufacturer(rs);
                }
            }
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    @Override
    public void save(Manufacturer manufacturer) {
        String query;

        if(manufacturer.getCode() > 0) {
            query = "UPDATE manufacturer SET mnf_name = ? WHERE mnf_code = ?";
        } else {
            query = "INSERT INTO manufacturer(mnf_name) VALUES (?)";
        }

        try(
                PreparedStatement stmt = getConnection().prepareStatement(query)
        ) {
            stmt.setString(1, manufacturer.getName());

            if(manufacturer.getCode() > 0) {
                stmt.setInt(2, manufacturer.getCode());
            }

            stmt.executeUpdate();
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        try(
                PreparedStatement stmt = getConnection().prepareStatement("DELETE FROM manufacturer WHERE mnf_code = ?")
        ) {
            stmt.setInt(1, id);

            stmt.executeUpdate();
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Manufacturer createManufacturer(ResultSet rs) throws SQLException {
        Manufacturer manufacturer = new Manufacturer();

        manufacturer.setCode(rs.getInt(1));
        manufacturer.setName(rs.getString(2));

        return manufacturer;
    }
}
