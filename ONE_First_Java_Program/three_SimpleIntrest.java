package ONE_First_Java_Program;//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;
public class three_SimpleIntrest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the Principal Amount:");
        long principal=input.nextLong();
        System.out.print("Enter the intrest:");
        float intrest=input.nextFloat();
        System.out.print("Enter the time:");
        int time=input.nextInt();

        float total=  (principal * time * intrest) /100;

        System.out.println("Simple Intrest is:"+total);




    }
}
