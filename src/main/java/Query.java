import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Query {
    static Statement stmt;
    public Query(DBconnect cnt) throws SQLException {
        stmt = DBconnect.connection.createStatement();
    }


}
