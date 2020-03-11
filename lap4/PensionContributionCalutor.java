package T1908a.lap4;

import java.util.Scanner;

public class PensionContributionCalutor {
    public static void main(String[] args) {
        final  int SALARY_CEILING =6000;
        final  double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final  double  EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final  double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final  double EMPLOYER_RATE_55_TO_60 = 0.13;
        final  double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final  double EMPLOYER_RATE_60_TO_65 = 0.09;
        final  double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final  double EMPLOYER_RATE_65_ABOVE = 0.075;


        // declare variables
        int salary , age;
        int contributableSalary;
        double employeeContribution, employerContribution, totalContribution;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter salary:");
        salary = scanner.nextInt();
        System.out.println("please enter age :");
        age = scanner.nextInt();
        System.out.println("please enter contributableSalary:");
        contributableSalary = scanner.nextInt();

        if(age<55){
            employeeContribution = contributableSalary*EMPLOYEE_RATE_55_AND_BELOW;
            employerContribution = contributableSalary* EMPLOYER_RATE_55_AND_BELOW;
        }else if(age<=60){
            employeeContribution = contributableSalary * EMPLOYEE_RATE_55_TO_60;
            employerContribution = contributableSalary * EMPLOYER_RATE_55_TO_60;

        }else if(age <= 65){
            employeeContribution = contributableSalary * EMPLOYEE_RATE_60_TO_65;
            employerContribution = contributableSalary * EMPLOYER_RATE_60_TO_65;

        }else {
            employeeContribution= contributableSalary * EMPLOYEE_RATE_65_ABOVE;
            employerContribution = contributableSalary * EMPLOYER_RATE_65_ABOVE;
        }

        totalContribution = employeeContribution+ employerContribution;

        System.out.println("The employee's contribution is:"+employeeContribution);
        System.out.println("the employer 's contribution is"+ employerContribution);
        System.out.println(" the total contribution is:"+ totalContribution);

    }

}
