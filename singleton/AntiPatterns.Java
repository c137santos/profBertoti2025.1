import java.sql.*;

public class DatabaseSingleton {
    private static DatabaseSingleton uniqueInstance = null;
    private Connection connection;

    public DatabaseSingleton(String credentials) {
        return connection = DriverManager.getConnection(credentials);
    }

}
