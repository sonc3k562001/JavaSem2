package thap_hinh;
import jdk.jshell.Snippet;

import java.util.Scanner;
public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner c1 = new Scanner(System.in);
        Scanner c2 = new Scanner(System.in);
        int a =7,b=5;
        //System.out.printf("Nhập số thứ nhất:");
        //a = c1.nextInt();
        //System.out.printf("\n Nhập số thứ hai:");
        //b =c2.nextInt();
        for(int i=1;i<= a ;i++ ){
            for(int j = 1; j<=b;j++){
                System.out.printf(" * ");
            }
            System.out.println("");
        }
        //chỗ này là hình tam giác đặc( khuyết phải)
        for(int i =1 ; i<=a;i++){
            for(int k =1 ; k<=i;k++){
                System.out.printf(" + ");
            }
            System.out.println();
        }
        //chỗ này là hình tam giác đặc khuyết trái
        for(int i= 1 ; i<=a;i++){
            for(int j = 1;j<=i;j++){
                System.out.printf("  ");
            }
            for(int k =a; k>=i;k--){
                System.out.printf(" +");
            }
            System.out.println();
        }

        for(int i= 1 ; i<=a ;i++){
            for(int j= a; j>=i;j--){
                System.out.printf("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.printf(" +");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=a;i++){
            for(int j = a;j>=i;j--){
                System.out.printf(" +");
            }
            System.out.println();
        }

        // thuat toan thap so
        for(int i= 1;i<=a ;i++){
            for(int j=i;j<=a; j++){
                j=j+1;
                System.out.printf("+");
            }
            System.out.println();
        }
    }
}
