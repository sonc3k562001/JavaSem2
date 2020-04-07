package StudentTable;

import giftshop.Giftcontroller;
import giftshop.Giftmodel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class view {

    ArrayList<Giftmodel> list = new ArrayList<>();

    public static void main(String[] args) throws SQLException {
        final int SETINEL = 4 ;
        int n ;
        Scanner scanner = new Scanner((System.in));

        System.out.println("Going to School...");
        Controller controller = new Controller();
        controller.menu();
        n = scanner.nextInt();

        while (n!= SETINEL){
            switch (n){
                case 1:
                    controller.addStudent();
                    break;
                case 2:
                    controller.displayStudent();
                    break;
                case 3:
                    System.out.println("save");
                    controller.save();
                    break;


                default:
                    break;

            }
            controller.menu();
            n = scanner.nextInt();
        }
        System.out.println("bye");
    }
}
