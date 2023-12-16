package TWO_Conditional_Loops.Conditional_Loops_Intermediate;

//Check Leap Year Or Not

import java.util.Scanner;
public class twenty_three_LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year : ");
        int year = input.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year");
                } else {
                    System.out.println(year + " is Not a Leap Year");
                }
            } else {
                System.out.println(year + " is a Leap Year");
            }
        } else {
            System.out.println(year + " is Not a Leap Year");
        }
    }
}
//        or
//        if((year%4==0 && year%100==0)||(year%400==0)){
//             System.out.print(year+" is a Leap Year");
//        }
//        else{
//            System.out.print(year + " is Not a Leap Year");
//        }

