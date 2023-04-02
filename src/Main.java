import java.sql.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws SQLException {

        new DBconnect();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten dang nhap: ");
        String enterUserName = sc.nextLine();

        System.out.println("Nhap mat khau: ");
        String enterPassword = sc.nextLine();

        System.out.println("Nhap email: ");
        String enterEmail = sc.nextLine();

//        Login login = new Login(enterUserName, enterPassword);
//        System.out.println(login.isValid());
        System.out.println(enterUserName);
        Signup signup = new Signup(enterUserName, enterPassword, enterEmail);
        signup.createAccount();
    }


}