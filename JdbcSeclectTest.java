package jav2;

import java.sql.*;

public class JdbcSeclectTest {
    public static void main(String[] args) {
        // Step 1: Allocate a database 'Connertion ' object
        // the format is: "jdbc:mysql://hostname:port/databaseName","username","password"
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/thuviensach?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "")) {

            try (Statement stmt = conn.createStatement()) {
                String strSelect = "select name,price,amoun from book";
                System.out.println("The SQL statement is: " + strSelect + "\n");

                ResultSet rset = stmt.executeQuery(strSelect);

                System.out.println("the records selected are:");
                int rowCount = 0;
                while (rset.next()) {
                    String title = rset.getString("name");
                    double price = rset.getDouble("price");
                    int qty = rset.getInt("amoun");
                    System.out.println(title + " ," + price + "," + qty);
                    ++rowCount;
                }
                System.out.println("Total number of records = " + rowCount);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}


