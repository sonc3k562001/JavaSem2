package jdbcUpdateTest;

import java.nio.channels.ScatteringByteChannel;
import java.sql.*;

public class update_northing {

    public static void main(String[] args) throws SQLException {
        try(Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/northing?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");
            Statement stmt = ((Connection) conn).createStatement();
        ){
            // chỗ này e viết của thương hiệu
            String strUpdate = "update Categories set CategoryName = 'SeaFood VN' where CategoryName = 'Seafood'";
            int countUpdate = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdate+"records affected");

            String strSelect = "select CategoryName from Categories";
            System.out.println(" The SQL statement is: "+ strSelect +"\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                System.out.println(rset.getString("CategoryName"));
            }
            // chỗ này e viết là của khách hàng
            String strUpdateCustomer ="update customers set Address= '1A Yet Kieu - Ha Noi' where CustomerID ='FRANK'";
            countUpdate = stmt.executeUpdate(strUpdateCustomer);
            System.out.println(countUpdate +"records affected");

            String strSelectCustomer = "select Address from customers where CustomerID ='FRANK'";
            System.out.println("The SQL statement is: "+ strSelectCustomer +"\n");
            ResultSet rsetcus = stmt.executeQuery(strSelectCustomer);
            while (rsetcus.next()){
                System.out.println(rsetcus.getString("Address"));
            }
            // chỗ này e viết của product nhé! :)
            String strUpdateProductes ="update products set UnitPrice = UnitPrice * 0.1 where CategoryID =5 or 7 or 8 ";
            countUpdate = stmt.executeUpdate(strUpdateProductes);
            System.out.println(countUpdate+"\t records affected");

            String strSelectProduct = "select UnitPrice from products where CategoryID =5 or 7 or 8";
            System.out.println(" The SQL statement is:"+strSelectProduct+"\n");
            ResultSet rsetPro = stmt.executeQuery(strSelectProduct);
            while (rsetPro.next()){
                System.out.println(rsetPro.getDouble("UnitPrice"));
            }

            //chỗ này e viết của shipVia nha cô;)
            String strUpdateOder ="update orders set ShipVia = 3 where OrderID = 10313 ";
            countUpdate = stmt.executeUpdate(strUpdateOder);
            System.out.println(countUpdate+"\t records affected");

            String StrSelectOrder = "select ShipVia from orders where OrderID = 10313";
            System.out.println(" The SQL statement is:"+StrSelectOrder+"\n");
            ResultSet rsetOrder = stmt.executeQuery(StrSelectOrder);
            while (rsetOrder.next()) {
                System.out.println(rsetOrder.getInt("ShipVia"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
