package T1908a.lap4;

import java.util.Scanner;

public class SalaesTaxCalculator {
    public static void main(String[] args) {
        final  double SAlES_TAX_RATE = 0.07;
        final  int SENTINEL = -1;

        double price,actuaPrice,salesTax;
        double totalPrice = 0.0 , totalActualPrice = 0.0,totalSalesTax = 0.0;

        Scanner scanner = new Scanner(System.in);
        price = 0;
        while (price != SENTINEL){
            System.out.printf("enter the tax- inclusive price in dollars ( or -1 to end ): ");
            price = scanner .nextDouble();
            salesTax = price % 100;
            actuaPrice = price - salesTax;

            totalPrice = totalPrice+ price;
            totalActualPrice = totalActualPrice + actuaPrice;
            totalSalesTax = totalSalesTax + salesTax;
            System.out.printf("Actual Price is:"+ actuaPrice);
            System.out.printf(",Sales Tax:"+ salesTax);
        }
        System.out.println("total Price is:"+ totalPrice);
        System.out.println(" total actualPrice: "+ totalActualPrice);
        System.out.println(" total sales tax is: "+ totalSalesTax);

    }
}
