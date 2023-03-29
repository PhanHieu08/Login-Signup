import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            String url = "jdbc:mysql://127.0.0.1:3306/mydb";
            String userName = "root";
            String password = "phanhieu08";

            Connection connection = DriverManager.getConnection(url, userName, password);

            while (true) {

                System.out.println("Insert student name");
                Scanner sc1 = new Scanner(System.in);
                String firstName = sc1.nextLine();

                Scanner sc2 = new Scanner(System.in);
                String lastName = sc2.nextLine();


                Statement stmt = connection.createStatement();
                stmt.execute("INSERT INTO students (first_name, last_name) VALUES('" +
                        firstName + "', '" + lastName + "')");

                ResultSet rs = stmt.executeQuery("SELECT * FROM students");

                while (rs.next()) {
                    System.out.println(rs.getInt(1) + " " + rs.getString(3) + " " + rs.getString(2));
                }
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}