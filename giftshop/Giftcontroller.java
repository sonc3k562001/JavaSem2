package giftshop;

import ArrayList.CreateArrayListExample.ArrayListCollectionsSortExample;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giftcontroller {
    ArrayList<Giftmodel> list = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);


    public void menu(){
        System.out.println("1. Hiển thị toàn bộ danh sách có trong thư viện");
        System.out.println("2. Nhập thêm sách");
        System.out.println("3. Xóa sách khỏi thư viện");
    }

    public void selectBook() throws SQLException {
        try(Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ebook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
            Statement stmt = conn.createStatement();
            ){
            String strSelect = " select * from books";
            System.out.println(" The SQL statement is: "+ strSelect +"\n");
            ResultSet rset = stmt.executeQuery(strSelect);

            while (rset.next()){
                System.out.println(rset.getInt("id")+","
                        + rset.getString("name_books")+","
                        + rset.getString("name_author")+","
                        + rset.getDouble("price_book")+","
                        + rset.getInt("qty_book"));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void  getInsert(Giftmodel gift){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/giftshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root","");
                //Step2
                Statement stmt = conn.createStatement();
                ) {

            String sqlInsert = "insert into books values("+ gift.getId()+","+gift.getName()+","+gift.getPrice()+","+gift.getQty()+")";
            System.out.println("The SQL statement is: "+ sqlInsert +"\n");
            int  countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getDelete(int id){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/giftshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root","");

                Statement stmt = conn.createStatement();
                ) {
                    String sqlDelete = " DElete from books where id = "+id;
                    System.out.println("The SQL statement is :"+ sqlDelete +"\n");
                    int countDelected = stmt.executeUpdate(sqlDelete);
                    System.out.println(countDelected + "records deleted.\n");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
