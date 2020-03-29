package jdbcUpdateTest;

import java.sql.*;

public class JdbcUpdateTest {
    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ebook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");
            Statement stmt = conn.createStatement();
        ){

            String strIsert =" insert into booksid,name_book,name_author,price_book,qty_book) values\n"+
                    "(8004,'A Cup of Java','dang kim thi',90,5)\n"+
                    "(8005,'A Teaspoon of java','Dang Kim Thi',89,6)";

            String strUpdate = "update books set price_book = price_book*0.5 where name_book = 'A Cup of Java'";
                    strUpdate="update books set qty_book=qty_book * 0 where name_book='A Teaspoon of java' ";
            System.out.println("The SQL statement is: "+ strUpdate  +"\n");
            int countUpdate = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdate+ "records affected.\n");

            String strSelect = "select * from books where id =  1001";
            System.out.println(" The SQL statement is: "+ strSelect +"\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                System.out.println(rset.getInt("id") +","
                + rset.getString("name_book")+","
                +rset.getString("name_author")+","
                        +rset.getDouble("price_book")+","
                        +rset.getInt("qty_book")+","
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
