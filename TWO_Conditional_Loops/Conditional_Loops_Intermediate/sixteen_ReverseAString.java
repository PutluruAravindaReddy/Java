package TWO_Conditional_Loops.Conditional_Loops_Intermediate;

//Reverse A String In Java without arrays

import java.util.Scanner;

public class sixteen_ReverseAString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("1.Normally Without Builder\n 2.Using String Builder \nEnter your choice :");
        int choice= input.nextInt();
        switch(choice) {
            case 1:
            System.out.print("Enter a String : ");
            String str = input.next();

            String reverse = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse = reverse + str.charAt(i);
            }

            System.out.println("Reversed string is : " + reverse);
            break;

            case 2:
                StringBuilder str1=new StringBuilder(input.next());

                System.out.println(str1.reverse());
                break;
        }


        }
    }

