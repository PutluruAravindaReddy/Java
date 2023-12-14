package First_Java_Program;
//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class two_GreetingMessage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Name:");
        String name=input.next();
        System.out.println("Hi "+name+" Welcome to the Bootcamp");
    }
}
