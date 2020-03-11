package T1908a.lap4;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        int numberIn;
        boolean isValid;
        Scanner scanner = new Scanner(System.in);
        isValid = false;
        do{
            System.out.println("enter a number between 0-10 or 90-100:");
            numberIn = scanner.nextInt();
            if( numberIn >0 && numberIn <10 || numberIn>90 && numberIn<100){
                isValid = true;
            }else {
                System.out.println("enter again : ");
            }
        }while (!isValid);
            System.out.println("you hava number:"+ numberIn);

    }
}
