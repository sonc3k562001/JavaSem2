package T1908a.Duration;

import java.util.Scanner;

abstract public class SalaryPolicy {

    private float baseSalary;
    abstract public float getSalary();

    public float getBaseSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter base salary:");
        return baseSalary = scanner.nextFloat();
    }

    public void setBaseSakary(float baseSalary) {
        this.baseSalary = baseSalary;
    }
}
