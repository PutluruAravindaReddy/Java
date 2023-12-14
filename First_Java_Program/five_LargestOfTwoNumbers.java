package First_Java_Program;
//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class five_LargestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter First value:");
        int a= input.nextInt();
        System.out.print("Enter Second value:");
        int b= input.nextInt();

        if(a>b){
            System.out.println(a+" is Largest");
        }
        else{
            System.out.println(b+" is Largest");
        }
    }
}
