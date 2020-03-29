package jav2;

import java.sql.*;
import java.util.Scanner;

public class jdbctvsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            String sqlInsert ;
            int countInserted;

            sqlInsert ="insert into books(id,name_book,name_author,price_book,qty_book) values\n"
                    +"(8002 , 'java' , 'D' , 80 , 5)\n"
                    +"(8001 ,'java advanced' , 'jame' , 20 , 5)\n"
                    +"(2001 , 'mysql java ' , 'T' , 30 , 5)";
            System.out.println("The SQL statement is:\t "+ sqlInsert+"\n");
            countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted+"records inserted.\n");

            String sqlDelete = "delete from books where id >8000";
            System.out.println("The SQL statement is: "+ sqlDelete +"\n");
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted +"records deleted.\n");

            String strSelect = "select * from books";
            System.out.println("The SQL statement is:"+ strSelect +"\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                System.out.println(
                         rset.getInt("id")+","
                        +rset.getString("name_book")+ ","
                        +rset.getString("name_author")+","
                        +rset.getBigDecimal("price_book")+","
                        +rset.getInt("qty_book")
                );
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
