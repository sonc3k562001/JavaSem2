package T1908a.lap4;

import java.util.Scanner;

public class Add2Integer {
    public static void main(String[] args) {
        int number1, number2,sum;
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter first integer");
        number1 = in.nextInt();
        number2 = in.nextInt();

        sum = number1 + number2;

        System.out.printf("The sum is: "+ sum);
        in.close();
    }
}
