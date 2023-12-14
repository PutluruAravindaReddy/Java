package TWO_Conditional_Loops.Conditional_Loops_Basic;

//Area Of Rectangle Program

import java.util.Scanner;

public class three_AreaOfRectangle {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);

            System.out.print("Enter Length:");
            float length= input.nextFloat();
            System.out.print("Enter Width:");
            float breadth= input.nextFloat();

            double area=length*breadth;

            System.out.print("Area of Rectangle is :"+area);

        }
    }

