package T1908a.lap4;

import java.util.Scanner;

public class IcomeTaxCalculatorWithSentinel {
    public static void main(String[] args) {
        final int SENTINEL = -1;
        final double rate_20k= 0.1;
        final double rate_40k= 0.2;
        final double rate_60k= 0.3;

        int taxableIncome;
        double taxPayable;

        System.out.print("Enter the taxable income (or -1 to end): $");
        Scanner scanner = new Scanner(System.in);
        taxableIncome = scanner.nextInt();

        while (taxableIncome != SENTINEL){
            if(taxableIncome<= 20000){
                taxPayable =  taxableIncome ;
            }else if(taxableIncome<= 40000){
                taxPayable = taxableIncome * rate_20k;
            }else  if(taxableIncome <= 60000){
                taxPayable = taxableIncome* rate_40k;
            }else {
                taxPayable = taxableIncome * rate_60k;
            }
            System.out.printf("The income tax payable is: $%.2f%n",taxPayable);

            System.out.print("Enter the taxable income ( or -1 to end):$");
            taxableIncome = scanner.nextInt();
        }
        System.out.printf("bye!");

    }
}
