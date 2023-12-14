package First_Java_Program;
//Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class one_NumisEVENorODD {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter First Value:");
        int a= input.nextInt();
        System.out.print("Enter Second Value:");
        int b= input.nextInt();

        if(a>b){
            System.out.println("Among " + a + " and " + b + " . " + a +" is Greater");
        }
        else{
            System.out.println("Among" + a + "and" + b + "." + b +"is Greater");
        }
    }
}
