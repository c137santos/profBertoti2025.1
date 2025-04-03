import java.sql.*;

public class DatabaseSingleton {
    private static DatabaseSingleton uniqueInstance = null;
    private Connection connection;

    private DatabaseSingleton(String credentials) {
        return connection = DriverManager.getConnection(credentials);
    }

    public static DatabaseSingleton getInstance(String credentials) {
        if (uniqueInstance == null) {
            uniqueInstance = new DatabaseSingleton(credentials);
        }
        return uniqueInstance;
    }
}
