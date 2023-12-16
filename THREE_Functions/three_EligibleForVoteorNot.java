package THREE_Functions;

//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;
public class three_EligibleForVoteorNot {

    public static void EligibleorNot(String name,int age) {
        if (age>=18){
            System.out.println(name + " is Eligible to vote in upcoming Elections.");
        }
        else{
            System.out.println(name + " is Not Eligible to vote.");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of person : ");
        String name= input.next();
        System.out.print("Enter the age : ");
        int age= input.nextInt();

        EligibleorNot(name,age);
    }
}
