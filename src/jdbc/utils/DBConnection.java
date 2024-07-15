package jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String USERNAME="postgres";
    private static final String PASSWORD="postgres";
    private static final String DB_URL="jdbc:postgresql://localhost:5432/my_csit_db";

    public static Connection getDBConnection() {
        Connection connection;
        try {
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("Successful DB Connection");
        } catch (SQLException e) {
            System.out.println("Database Connection Failed");
            throw new RuntimeException(e);
        }
        return connection;
    }
}
