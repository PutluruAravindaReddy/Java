package TWO_Conditional_Loops.Conditional_Loops_Intermediate;

//Calculate Distance Between Two Points

import java.util.Scanner;

public class five_DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //   root of (x2-x1)^2 + (y2 - y1)^2

        System.out.print("Enter value of x2 : ");
        double x2= input.nextDouble();
        System.out.print("Enter value of x1 : ");
        double x1= input.nextDouble();
        System.out.print("Enter value of y2 : ");
        double y2= input.nextDouble();
        System.out.print("Enter value of y1 : ");
        double y1= input.nextDouble();

        double distance=Math.sqrt(Math.pow((x2 - x1),2)+Math.pow((y2 - y1),2));
        System.out.println("Distance is : " + distance);
    }
}
