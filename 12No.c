// Write a program in C with recursive function to compute the value Xn
// where n is a positive integer and x has real value.

#include<stdio.h>

double power(double x , int n)
{
    if(n == 0)
    {
        return 1 ;
    }else{
        return x *power(x,n-1) ;//Recursive step : x* X^(n-1).
    }
}

int main()
{
    double x ; 
    int n ; 
    printf("Enter the real valu x : ");
    scanf("%lf" , &x);

    printf("Enter the positive interger n : ");
    scanf("%d" ,&n);

    if(n<0)
    {
        printf("n must be a positive integer .\n");
        return 1 ;
    }
    double result = power(x,n);
    printf("The value of %.f^%d is %.2lf\n",x , n , result);

    return 0;
}