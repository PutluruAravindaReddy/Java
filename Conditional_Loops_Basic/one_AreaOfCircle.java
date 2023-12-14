package Conditional_Loops_Basic;

//Area Of Circle Java Program

import java.util.Scanner;
public class one_AreaOfCircle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter Radius of circle:");
        float r= input.nextFloat();

        double area=(3.14)*r*r;

        System.out.print("Area of Circle is :"+area);

    }
}
