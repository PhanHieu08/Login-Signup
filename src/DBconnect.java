import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {
    private final String  _url = "jdbc:mysql://127.0.0.1:3306/mydb";
    private final String _userName = "root";
    private final String _password = "phanhieu08";
    static Connection connection;
    public DBconnect() throws SQLException {
        connection = DriverManager.getConnection(_url, _userName, _password);
    }
}
