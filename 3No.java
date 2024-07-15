// An employee’s total weekly pay is calculated by multiplying the
// hourly wage and number of regular hours plus any overtime pay which
// in turn is calculated as total overtime hours multiplied by 1.5 times the
// hourly wage. Write a program that takes as inputs the hourly wage,
// total regular hours, and total overtime hours, and prints an employee’s
// total weekly pay.

import java.util.Scanner;

public class WeeklyPayCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for inputs
        System.out.print("Enter hourly wage: ");
        double hourlyWage = scanner.nextDouble();

        System.out.print("Enter total regular hours: ");
        double regularHours = scanner.nextDouble();

        System.out.print("Enter total overtime hours: ");
        double overtimeHours = scanner.nextDouble();

        // Calculate the total weekly pay
        double regularPay = hourlyWage * regularHours;
        double overtimePay = overtimeHours * hourlyWage * 1.5;
        double totalWeeklyPay = regularPay + overtimePay;

        // Print the total weekly pay
        System.out.printf("Total weekly pay: $%.2f%n", totalWeeklyPay);

        scanner.close();
    }
}