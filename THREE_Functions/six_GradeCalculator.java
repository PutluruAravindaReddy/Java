package THREE_Functions;

//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

import java.util.Scanner;

public class six_GradeCalculator {
    public static void GradeCalculator(int marks){
        if(marks>=91 && marks<=100){
            System.out.println("You grade is AA");
        }
        else if(marks>=81 && marks<=90){
            System.out.println("Your grade is AB");
        }
        else if(marks>=71 && marks<=80){
            System.out.println("Your grade is BB");
        }
        else if(marks>=61 && marks<=70){
            System.out.println("Your grade is BC");
        }
        else if(marks>=51 && marks<=60){
            System.out.println("Your grade is CD");
        }
        else if(marks>=41 && marks<=50){
            System.out.println("Your grade is DD");
        }
        else if(marks>=0 && marks<=40){
            System.out.println("Fail");
        }
        else{
            System.out.println("Enter out of 100");
        }
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter your marks out of 100 : ");
        int marks=input.nextInt();

        GradeCalculator(marks);
    }
}
