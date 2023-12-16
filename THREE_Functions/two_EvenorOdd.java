package THREE_Functions;

//Define a program to find out whether a given number is even or odd.

import java.util.Scanner;
public class two_EvenorOdd {

    public static void EvenorOdd(int num){
        if(num%2==0){
            System.out.println("Entered number is even");
        }
        else{
            System.out.println("Entered number is odd");
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num= input.nextInt();
        EvenorOdd(num);
    }
}
