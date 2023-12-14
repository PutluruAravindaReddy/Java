package TWO_Conditional_Loops.Conditional_Loops_Intermediate;

//Calculate Electricity Bill

import java.util.Scanner;
public class two_ElectricityBill {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter How many units of current used: ");
        double unitsused= input.nextDouble();

        System.out.print("Enter the cost of each unit: ");
        double cost= input.nextDouble();

        double currentBill=unitsused*cost;

        System.out.println("Current Bill Generated is : "+currentBill);

    }

}
