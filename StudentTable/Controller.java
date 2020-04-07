package StudentTable;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    ArrayList<modul> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void menu(){
        System.out.println("1. Add student records\n" +
                "2. Display student records\n" +
                "3. Save\n" +
                "4. Exit");
    }

    public void addStudent(){
        System.out.printf("enter student id:");
        String id =scanner.nextLine();
        System.out.printf("enter name student:");
        String name = scanner.nextLine();
        System.out.printf("enter address student :");
        String address = scanner.nextLine();
        System.out.printf("enter phone student:");
        String phone = scanner.nextLine();
        modul s1 = new modul(id,name,address,phone);
        list.add(s1);
    }
    public void displayStudent(){
        try(Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studenttable?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");
            Statement stmt = conn.createStatement();
        ) {
            ResultSet rset =stmt.executeQuery("select * from student");
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numColumns = rsetMD.getColumnCount();

            for(int i = 1;i <= numColumns;i++ ){
                System.out.printf("%-30s",rsetMD.getColumnName(i));
            }
            System.out.println();

            for(int i = 1 ; i<= numColumns;i++){
                System.out.printf("%-30s",
                        "(" +rsetMD.getColumnClassName(i)+")");
            }
            System.out.println();

            while (rset.next()){
                for(int i = 1 ; i<= numColumns;i++){
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void save(){

        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/studenttable?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root","");
                //Step2
                Statement stmt = conn.createStatement();
                PreparedStatement pstmt = conn.prepareStatement("insert into student values (?, ?, ?, ?)");

        ) {
            conn.setAutoCommit(false);  // Disable auto-commit for each SQL statement
            for (int i=0; i<this.list.size();i++){
                pstmt.setString(1, list.get(i).getId());  // Set values for parameters 1 to 5
                pstmt.setString(2, list.get(i).getName());
                pstmt.setString(3, list.get(i).getAddress());
                pstmt.setString(4, list.get(i).getPhone());
                pstmt.addBatch();
                pstmt.executeBatch();
                pstmt.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
