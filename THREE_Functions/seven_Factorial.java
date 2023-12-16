package THREE_Functions;

//Write a program to print the factorial of a number by defining a method named 'Factorial'.
// Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n.
// E.g.-
//        4! = 1 * 2 * 3 * 4 = 24
//        3! = 3 * 2 * 1 = 6
//        2! = 2 * 1 = 2
//        Also,
//        1! = 1
//        0! = 1

import java.util.Scanner;

public class seven_Factorial {
    public static void Factorial(int n){
        int fact=1;
        System.out.print(n+"! = ");
        for (int i=n;i>0;i--){
            fact = fact*i;
            System.out.print(i+" * ");
        }
        System.out.print(" = "+fact);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n=input.nextInt();

        Factorial(n);
    }
}
