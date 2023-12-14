package Conditional_Loops_Basic;

//Input a number and print all the factors of that number (use loops).

import java.util.Scanner;
public class twenty_three_FactorsOfaNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n= input.nextInt();

        for(int i=1;i<=n;i++){
            if(n%i==0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("These are the factors of "+n);
    }
}
