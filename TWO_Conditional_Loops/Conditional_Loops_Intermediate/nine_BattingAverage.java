package TWO_Conditional_Loops.Conditional_Loops_Intermediate;

//Calculate Batting Average

import java.util.Scanner;


public class nine_BattingAverage {
    public static double Batsman_Average(long runs,long NoOfInnings){

        double average = (double)runs/NoOfInnings;
        return average;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the player name : ");
        String player = input.next();

        System.out.print("Enter the total runs : ");
        long runs= input.nextLong();

        System.out.print("Enter no.of innings : ");
        long NoOfInnings= input.nextLong();

        System.out.println("Batting Average of "+ player+" is : "+Batsman_Average(runs,NoOfInnings));

    }
}
