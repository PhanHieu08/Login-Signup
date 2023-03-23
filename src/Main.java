import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://127.0.0.1/mydb", "root", "phanhieu08");

            Statement statement =connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from product");

            while (resultSet.next())
                System.out.println(resultSet.getString("product_name"));
        }
        catch (Exception e) {
            System.out.println(e);
        }
//        try {
//            // The newInstance() call is a work around for some
//            // broken Java implementations
//
////            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
//            Connection connection =
//                    DriverManager.getConnection("jdbc:mysql://127.0.0.1/mydb", "root", "phanhieu08");
//            Statement statement = connection.createStatement();
//
//            ResultSet resultSet = statement.executeQuery("select * from product");
//
//            while (resultSet.next())
//                System.out.println(resultSet.getString("product_name"));
//
//        } catch (Exception ex) {
//            // handle the error
//        }
    }
}