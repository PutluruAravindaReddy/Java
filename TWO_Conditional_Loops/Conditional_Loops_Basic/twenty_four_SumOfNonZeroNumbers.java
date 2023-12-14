package TWO_Conditional_Loops.Conditional_Loops_Basic;
//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;

public class twenty_four_SumOfNonZeroNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=1, sum = 0;

        while (n != 0) {
            System.out.print("Enter a Number : ");
            n = input.nextInt();
            sum = sum + n;
        }

        System.out.println("Sum of all non Zero Numbers:" + sum);
    }
}
