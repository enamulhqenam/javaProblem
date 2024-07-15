// Write a program using java that reads five numbers from keyboard and
// display the smaller, larger and average of those numbers.

import java.util.Scanner;

public class NumberAnalysis{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0 ;

        System.out.println("Enter five numbers : ");

        for(int i = 0 ; i< 5 ; i++)
        {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        int smallest = numbers[0] ;
        int largest = numbers[0] ;

        for(int i = 1 ; i<5 ; i++)
        {
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        double average = (double) sum / 5 ;

        System.out.println("Smallest number : "+ smallest);
        System.out.println("Largest Number : "+ largest);
        System.out.println("Average : "+average);

        scanner.close();
    }
}