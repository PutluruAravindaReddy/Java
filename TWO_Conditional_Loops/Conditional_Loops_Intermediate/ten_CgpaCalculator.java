package TWO_Conditional_Loops.Conditional_Loops_Intermediate;

//Calculate CGPA Java Program

import java.util.Scanner;

public class ten_CgpaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of subjects : ");
        int n=input.nextInt();

        Cgpa(n);
    }
    public static void Cgpa(int n){
        Scanner input =new Scanner(System.in);
        float grade =0,prev=0;
        for (int i = 0;i < n;i++){
            System.out.print("Enter each subjects grade : ");
             grade= input.nextFloat();
            grade = grade+prev;
             prev=grade;
        }
        System.out.println("Cgpa for this semester is : " + grade/n);
    }
}
