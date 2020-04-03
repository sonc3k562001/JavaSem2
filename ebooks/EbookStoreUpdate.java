package ebooks;


import java.sql.*;

public class EbookStoreUpdate {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ebook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");
             Statement stmt = conn.createStatement();

             PreparedStatement pstmt = conn.prepareStatement(
                     "insert into books values (?,?,?,?,?)");
             PreparedStatement pstmtSelect = conn.prepareStatement("select * from books");
        ) {
            pstmt.setInt(1,3004);
            pstmt.setString(2,"java spring");
            pstmt.setString(3,"Orange");
            pstmt.setDouble(4,65.5);
            pstmt.setInt(5,8);

            int rowsInserted = pstmt.executeUpdate();
            System.out.println(rowsInserted + "rows affected.");

            pstmt.setInt(1,3003);
            pstmt.setString(2,"node js");
            pstmt.setString(3,"Orange");
            pstmt.setDouble(4,65.5);
            pstmt.setInt(5,8);

            rowsInserted = pstmt.executeUpdate();
            System.out.println(rowsInserted + "rows affected.");

            ResultSet rset = pstmtSelect.executeQuery();
            while (rset.next()){
                System.out.println(rset.getInt("id")+"," +
                        rset.getString("name_book")+","+
                        rset.getString("name_author")+","+
                        rset.getDouble("price_book")+","+
                        rset.getInt("qty_book")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
