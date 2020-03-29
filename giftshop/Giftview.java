package giftshop;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Giftview {


    ArrayList<Giftmodel> list = new ArrayList<>();

    public static void main(String[] args) throws SQLException {
        final int SETINEL = 0 ;
        int n ;
        Scanner scanner = new Scanner((System.in));

        System.out.println("Going shop ...");
        Giftcontroller controler = new Giftcontroller();
        controler.menu();
        n = scanner.nextInt();

        while (n!= SETINEL){
            switch (n){
                case 1:
                    System.out.println("Books List");
                    controler.selectBook();
                    break;
                case 2:
                    System.out.println(" Enter id :");
                    int id = scanner.nextInt();
                    System.out.println("enter name:");
                    String name= scanner.next();
                    System.out.println("enter author:");
                    String author = scanner.next();
                    System.out.println("enter price:");
                    Double price = scanner.nextDouble();
                    System.out.println("enter qty:");
                    Integer qty = scanner.nextInt();

                    Giftmodel gift = new Giftmodel(id,name,author,price,qty);
                    controler.getInsert(gift);
                    break;
                case 3:
                    System.out.println("enter id:");
                    int idD = scanner.nextInt();
                    controler.getDelete(idD);
                    continue;

                default:
                    break;

            }
            controler.menu();
            n = scanner.nextInt();
        }
        System.out.println("bye");
    }
}
