import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Signup {
    private String _username;
    private String _password;
    private String _email;

    public Signup(String enterUserName, String enterPassword, String enterEmail) {
        _username = enterUserName;
        _password = enterPassword;
        _email = enterEmail;
    }
    void createAccount() throws SQLException {
        Statement stmt = DBconnect.connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT user_name FROM user WHERE user_name='" + _username + "' LIMIT 1");

        if(!rs.next()) {
            stmt.execute("INSERT INTO user VALUES('" + _username + "', '" + _password + "', '" + _email + "')");
            System.out.println("Dang ki thanh cong");
        }
        else
            System.out.println("Dang ki that bai");
    }

}
