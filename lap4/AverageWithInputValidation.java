package T1908a.lap4;

import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        final  int NUM_STUDENTS = 3;

        int numberInt ;
        boolean isValid;
        int sum = 0 ;
        double average;
        Scanner scanner = new Scanner(System.in);
        for( int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo){
            isValid = false;
            do {
                numberInt = scanner.nextInt();
              if((numberInt >= 0) && (numberInt <= 100)){
                  System.out.println("enter the mark ( 0-100) for student"+studentNo+":"+numberInt);
                  isValid = true;
              }else {
                  System.out.println("try again :");
                  isValid = false;
              } 
            }while (!isValid);
            sum += numberInt;
        }
        average = sum  / 3;
        System.out.println(" the average is:"+average );
    }
}
