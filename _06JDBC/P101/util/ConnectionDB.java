package _06JDBC.P101.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/store?serverTimezone=America/Lima";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";
    private static Connection connection;

    public static Connection getInstance() throws SQLException {
        if(connection == null) {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }

        return connection;
    }
}
