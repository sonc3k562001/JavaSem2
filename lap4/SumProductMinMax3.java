package T1908a.lap4;

import com.sun.source.tree.Scope;

import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        int number1 , number2, number3;
        int sum , product, min , max;
        Scanner num = new Scanner(System.in);

        number1 = num.nextInt();
        number2 = num.nextInt();
        number3 = num.nextInt();

        sum = number1+ number2 + number3;
        product = number1* number2* number3;

        min = number1;

        if(number2<min){
            min = number2;
        }
        if(number3<min){
            min = number3;
        }

        System.out.printf("min = "+ min);

        max = number3;
        if(number3<number2){
            max = number2;
        }
        if(number3 <number1){
            max = number1;
        }
        System.out.printf("max = "+ max);

        System.out.printf("sum = "+ sum);
        System.out.println("product"+ product);
    }
}
