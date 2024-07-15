// Write a program to sort an array and find max, min value.

import java.util.Arrays;
import java.util.Scanner ;

public class ArrayOpe{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements int the array : ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array : ");
        for(int i=0 ; i<n ; i++)
        {
            array[i] = scanner.nextInt() ;
        }
        Arrays.sort(array);

        int minValue = array[0];
        int maxValue = array[n-1];

        System.out.println("Sorted array : "+Arrays.toString(array));
        System.out.println("Minimum Value : "+minValue);
        System.out.println("Maximum Value :"+maxValue );

        scanner.close();

    }
}
