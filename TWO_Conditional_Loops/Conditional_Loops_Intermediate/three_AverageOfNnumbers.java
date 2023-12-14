package TWO_Conditional_Loops.Conditional_Loops_Intermediate;

//Calculate Average Of N Numbers

import java.util.Scanner;
public class three_AverageOfNnumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter how many numbers you want to find the average for? : ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 0;i < n;i++){
            sum = sum + input.nextInt();
        }
        double average=(double)sum/n;
        System.out.println("Average of The Entere numbers is :"+ average);

    }
}
