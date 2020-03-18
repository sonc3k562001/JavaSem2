package jav2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int size;
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Enter the size:");
        size = scanner.nextInt();
        int[] array = new int[size];
        double sum=0;
        for(int i = 0 ; i<size;i++){
            array[i]= scanner.nextInt();
            sum += array[i];
        }
        double Average;
        Average = (double)sum /size;
        System.out.println("the Average is:"+ Average);
    }
}
