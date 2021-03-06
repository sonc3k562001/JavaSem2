package ebooks;

import java.sql.*;

public class EbooksStore {

    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ebook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");
        Statement stmt = conn.createStatement();
            ){
            String strinsert =" insert into books values" +
                    "(2010 ,'java core ','nguyen giang son',27,39)," +
                    "(2011,'jave Web' ,'dang kim thi ', 38, 29)";
                int countInsert = stmt.executeUpdate(strinsert);
            System.out.println(countInsert +"insert file");

            ResultSet rset = stmt.executeQuery("select * from books");
            ResultSetMetaData rsetMD = rset.getMetaData();

            int numColumns = rsetMD.getColumnCount();

            for(int i = 1 ;i<=numColumns;i++){
                System.out.printf("%-30s",rsetMD.getColumnClassName(i));
            }

            System.out.println();

            for(int i =1 ;i<=numColumns;i++){
                System.out.printf("%-30s",
                        "(" +rsetMD.getColumnClassName(i)+")");
            }
            System.out.println();

            while (rset.next()){
                for(int i =1;i<=numColumns;i++){
                    System.out.printf("%-30s",rset.getString(i));
                }
                System.out.println();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
