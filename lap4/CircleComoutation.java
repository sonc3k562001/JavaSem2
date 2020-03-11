package T1908a.lap4;

import java.util.Scanner;

public class CircleComoutation {
    public static void main(String[] args) {
        double radius = 0, diameter, circumference, area;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius:");
        radius = scanner.nextDouble();
        diameter = 2.0 * radius;
        area  = Math.PI * radius* radius;
        circumference = 2.0 * Math.PI * radius;
        System.out.printf("Diameter is: %.2f%n",diameter);
        System.out.printf("Diameter is: %.2f%n",area);
        System.out.printf("Diameter is: %.2f%n",circumference);
    }
}
