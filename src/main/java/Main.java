import java.sql.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws SQLException {
// Hieu branch
        DBconnect connection = new DBconnect();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten dang nhap: ");
        String enterUserName = sc.nextLine();

        System.out.println("Nhap mat khau: ");
        String enterPassword = sc.nextLine();

        System.out.println("Nhap email: ");
        String enterEmail = sc.nextLine();

//        Signup signup = new Signup(enterUserName, enterPassword, enterEmail);
//        signup.createAccount();

        Login login = new Login(enterUserName, enterPassword);
        System.out.println(login.isValid());
//        Statement stmt = DBconnect.connection.createStatement();
//
//        ResultSet rs = stmt.executeQuery("SELECT * FROM users");
//
//        while (rs.next()) {
//            System.out.println(rs.getString(1) + " " + rs.getString(3) + " " + rs.getString(2));
//        }
    }


}
