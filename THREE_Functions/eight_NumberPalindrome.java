package THREE_Functions;

//Write a function to find if a number is a palindrome or not. Take number as parameter.

import java.util.Scanner;
public class eight_NumberPalindrome {
    public static void StringBuilder(int number){
        StringBuilder StringBuilder=new StringBuilder();
        StringBuilder.append(number);
        String str=StringBuilder.toString();
        StringBuilder strr=StringBuilder.reverse();
        String strrev= strr.toString();
        if(str.equals(strrev)){
            System.out.print("Entered number is Palindrome.");
        }
        else{
            System.out.print("Entered number is Not Palindrome.");
        }
    }
    public static void NumberReversal(int number){
        String str=Integer.toString(number);
        String strrev="";
        for (int i=0;i<str.length();i++){
            int num=number%10;
            strrev=strrev+Integer.toString(num);
            number=number/10;
        }
        if(str.equals(strrev)){
            System.out.print("Entered number is Palindrome.");
        }
        else{
            System.out.print("Entered number is Not Palindrome.");
        }
    }
    public static void StringReverse(int number){
        String str=Integer.toString(number);
        String strrev="";
        for (int i=str.length();i>0;i--){
            strrev=strrev+str.substring(i-1,i);
        }
        if(str.equals(strrev)){
            System.out.print("Entered number is Palindrome.");
        }
        else{
            System.out.print("Entered number is Not Palindrome.");
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number= input.nextInt();;

        System.out.print("1.String Builder Method\n2.Number reversal\n3.Convert to string and Reverse\nEnter you choice:");
        switch(input.nextInt()){
            case 1:
                StringBuilder(number);
                break;
            case 2:
                NumberReversal(number);
                break;
            case 3:
                StringReverse(number);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
