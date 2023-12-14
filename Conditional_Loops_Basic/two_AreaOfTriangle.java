package Conditional_Loops_Basic;

import java.util.Scanner;
public class two_AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter base of Traingle");
        float length= input.nextFloat();
        System.out.print("Enter height of Traingle");
        float breadth= input.nextFloat();

        double area=(length*breadth)/2;


        System.out.print("Area of Triangle is :"+area);


    }
}
