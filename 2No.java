// What is recursion? Write a factorial program in Java using recursion.
public class Factorial {
    public static void main(String[] args) {
        int num = 6 ;
        long factorial = multiplyNumbers(num) ;

        System.out.println("Factorial of "+ num + " = " + factorial) ;
    }
    public static long multiplyNumbers(int num){
        if(num>=1){
            //using recusive function ,call same function name
            return num* multiplyNumbers(num -1) ;
        }
        else{
            return 1 ;
        }
    }
}
