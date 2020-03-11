package T1908a.lap4;

import java.util.Scanner;

public class SumOfDigitsInt {
    public static void main(String[] args) {
        int inNumber;
        int SumDigit = 0 ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter inNumber:");
        inNumber = scanner.nextInt();
        while (inNumber>0){
            int n ;
            n = inNumber%10;
            SumDigit = SumDigit+ n;
            inNumber/=10;
        }
        System.out.println("Sum Digit is:"+SumDigit);
    }
}
