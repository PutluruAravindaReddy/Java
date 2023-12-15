package TWO_Conditional_Loops.Conditional_Loops_Intermediate;
//Java Program Vowel Or Consonant

import java.util.Scanner;
public class twenty_one_VowelorConstant {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("1.Using String type\n2.Using Char type\nEnter your choice :");
        int choice= input.nextInt();
        switch(choice) {
            case 1:

                System.out.print("Enter a character:");
                String str = input.next().substring(0, 1);

                if (str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u")) {
                    System.out.print("Entered Character is an Vowel");
                } else {
                    System.out.print("Entered Character is not an Vowel");
                }
                break;
            case 2:

                System.out.print("Enter a character:");
                char ch = input.next().trim().charAt(0);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.print("Entered Character is an Vowel");
                } else {
                    System.out.print("Entered Character is not an Vowel");
                }
                break;
        }

    }
}
