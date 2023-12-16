package THREE_Functions;

//Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;
public class eleven_SumOfnNaturalNumbers {
    public static void sumOfNaturalNumbers(int n){
        int sum=n*(n+1)/2;
        System.out.println("Sum of first n natural numbers is : "+sum);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n=input.nextInt();

        sumOfNaturalNumbers(n);
    }
}
