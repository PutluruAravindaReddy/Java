package Conditional_Loops_Basic;

//Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;

public class twenty_five_LargestNonZeroNumber {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n=1,prev,largest=0;

            while (n != 0) {
                prev=n;
                System.out.print("Enter a Number : ");
                n = input.nextInt();
                if(n>prev){
                    largest = n;
                }
            }

            System.out.println("Largest among all non Zero Numbers is : " + largest);
        }
    }


