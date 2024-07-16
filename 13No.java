// What is algorithm? Write down the algorithm to find out the second
// highest and second lowest element in an n-element array.

import java.util.Scanner;
public class SecondHightLowest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array : ");
        int n = scanner.nextInt();

        if(n<2){
            System.out.println("Array should have at least tow elements.");
            return;
        }

        int[] array = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0 ; i<n ; i++){
            array[i] = scanner.nextInt();
        }

        //initialize variables 
        int firstHighest    = Integer.MIN_VALUE ;
        int secondHighest   = Integer.MIN_VALUE ;
        int firstLowest     = Integer.MAX_VALUE ;
        int secondLowest    = Integer.MAX_VALUE ;

        for(int i = 0 ; i<n ; i++){
            if(array[i] > firstHighest){
                secondHighest = firstHighest ;
                firstHighest = array[i];
            }
            else if(array[i] > secondHighest && array[i] != firstHighest){
                secondHighest = array[i];
            }
        }
        //check if second highst and second lowest were found 
        if(secondHighest == Integer.MIN_VALUE){
            System.out.println("THere is no second hight element . ");
        }
        else{
            System.out.println("THe second highest element is : "+secondHighest);
        }
        if(secondLowest == Integer.MAX_VALUE){
            System.out.println("THere is no second lowest element .");
        }
        else{
            System.out.println("The second lowest element is : "+secondLowest);
        }

        scanner.close();
    }
}