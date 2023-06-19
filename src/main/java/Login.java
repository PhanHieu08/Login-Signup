import com.mysql.cj.log.Log;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
//    User user;
    private String _userName;
    private String _password;
    public Login(String enterUserName, String enterPassword) {
        _userName = enterUserName;
        _password = enterPassword;
    }
    boolean isValid() throws SQLException {
        Statement stmt = DBconnect.connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT password FROM user WHERE user_name='" + _userName + "'");

        if (rs.next() && _password.equals(rs.getString(1)))
            return true;

        return false;
    }
}
