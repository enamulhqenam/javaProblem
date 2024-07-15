import java.util.* ;
import java.lang.* ;

class GFG {
    static int sumOfseries(int n )
    {
        int result = 0 ;
        int i ;
        for(i = 1 ; i <=n ; i++)
        {
            if( i%2 == 0){ //even
                result = result - (int)Math.pow(i, 2);
            }
                
            else{ //odd
                result = result + (int)Math.pow(i,2);
            }
            
        }
        return result ;
    }
    
    public static void main(String args[])
    {
        int n = 3 ;
        System.out.println(sumOfseries(n));

        n =10;
        System.out.println(sumOfseries(n));
    }
}

