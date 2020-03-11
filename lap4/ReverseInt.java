package T1908a.lap4;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        int inNumber;
        int inDigit = 0;

        Scanner scanner = new Scanner(System.in);
        inNumber = scanner.nextInt();
        while (inNumber>0){
            inDigit = inNumber % 10 ;
            System.out.print(inDigit);
            inNumber/= 10;
        }

    }
}
