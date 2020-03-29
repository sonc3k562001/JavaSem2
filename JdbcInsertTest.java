package jav2;

import java.sql.*;

public class JdbcInsertTest {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/thuviensach?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "")) {

            try (Statement stmt = conn.createStatement()) {
                String strSelect = "select id ,name,public_year,public_number,price,amoun,statuss,id_tg,id_ls,id_nxb from book";
                System.out.println("The SQL statement is: " + strSelect + "\n");

                ResultSet rset = stmt.executeQuery(strSelect);

                System.out.println("the records selected are:");

                String sqlInsert = " insert into book values"+
                        "(2002,'java' ,3,2001,91,30,1,1,1,1)";
                int countInserted = stmt.executeUpdate(sqlInsert);
                System.out.println(countInserted+"records inserted. \n");

                System.out.println(sqlInsert);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
