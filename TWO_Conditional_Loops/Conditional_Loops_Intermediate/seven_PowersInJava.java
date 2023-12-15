package TWO_Conditional_Loops.Conditional_Loops_Intermediate;

//Power In Java

import java.util.Scanner;

public class seven_PowersInJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number=input.nextInt();
        System.out.print("Enter the power : ");
        int power= input.nextInt();

        int Output =(int) Math.pow(number,power);
        System.out.println("The output is : "+Output);
    }
}
