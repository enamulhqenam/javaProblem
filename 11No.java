// Write a program to calculate GPA, avg, and total marks.

import java.util.Scanner ;

public class CGPA{
    public static void main(String args[]){
      
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enater the mark of subject : ");
        int numberOfSbuject = scanner.nextInt();

        int[] marks = new int[numberOfSbuject];
        for(int i = 0 ; i<numberOfSbuject ; i++){
            System.out.println("Enter marsk for subject "+(i+1)+" : ");
            marks[i] = scanner.nextInt();
        }

        //calclute total marke
        int totalMarks = 0;
        for(int mark : marks){
            totalMarks +=mark ;
        }
        // calclute average marks 
        double averageMarks = (double)totalMarks / numberOfSbuject ;
        // avarage percentage of marke 
        double gpa = (averageMarks/10)*4 ;

        System.out.println("Total Marks : "+totalMarks);
        System.out.println("Average Marks :  "+String.format("%.2f", averageMarks));
        System.out.println("GPA : "+String.format("%.2f", gpa));


        scanner.close();


    }
}
