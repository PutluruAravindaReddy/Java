package TWO_Conditional_Loops.Conditional_Loops_Intermediate;

//Find if a number is palindrome or not

import java.util.Scanner;

public class seventeen_Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1.Normally Without Builder\n2.Using String Builder\nEnter your choice :");
        int choice= input.nextInt();
        switch(choice) {
            case 1:
                System.out.print("Enter a String : ");
                String str = input.next();

                String reverse = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    reverse = reverse + str.charAt(i);
                }
                if(str.equals(reverse)){
                    System.out.println("Entered String is Palindrome");
                }
                else{
                    System.out.println("Entered String is not a Palindrome");
                }
                break;
            case 2:
                System.out.print("Enter a String : ");
                StringBuilder str1=new StringBuilder(input.next());

                if (str1==str1.reverse()){
                    System.out.println("Entered String is Palindrome");
                }
                else{
                    System.out.println("Entered String is not a Palindrome");
                }
                break;
        }
    }
}
