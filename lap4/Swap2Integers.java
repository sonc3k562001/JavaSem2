package T1908a.lap4;

import java.util.Scanner;

public class Swap2Integers {
    public static void main(String[] args) {
        int number1, number2;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter the firt number:");
        number1 = scanner.nextInt();
        System.out.println(" enter the second number:");
        number2 = scanner.nextInt();
        int temp = number1 ;
        number1 = number2;
        number2 =temp;
        temp = number1;
        System.out.println("the firt = second");
        System.out.println("the  firt number:"+number1);;

        System.out.println("the second number"+number2);

    }
}
