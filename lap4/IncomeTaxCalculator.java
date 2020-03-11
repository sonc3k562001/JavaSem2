package T1908a.lap4;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        final   double rate_20k = 0.1;
        final   double rate_40k = 0.2;
        final   double rate_60k = 0.3;

        int taxableIncome;
        double taxaPayable;

        Scanner scanner = new Scanner(System.in);
        System.out.printf("enter taxable Icome :");
        taxableIncome = scanner.nextInt();

        if(taxableIncome<= 20000){
            taxaPayable =  taxableIncome ;
        }else if(taxableIncome<= 40000){
            taxaPayable = taxableIncome * rate_20k;
        }else  if(taxableIncome <= 60000){
            taxaPayable = taxableIncome* rate_40k;
        }else {
            taxaPayable = taxableIncome * rate_60k;
        }
        System.out.printf("The income tax payable is: $%.2f%n",taxaPayable);
    }
}
