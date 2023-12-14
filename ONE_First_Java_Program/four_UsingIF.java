package ONE_First_Java_Program;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class four_UsingIF {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter First value:");
        int a= input.nextInt();
        System.out.print("Enter Second value:");
        int b= input.nextInt();

        if((a*b)==0){
            System.out.println("One of the entered values contains 0 values ");
        }
        else{
            System.out.println("Multiplication of entered values is:"+(a*b));
        }
    }
}
