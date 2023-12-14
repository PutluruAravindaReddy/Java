package TWO_Conditional_Loops.Conditional_Loops_Basic;

//Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class twenty_two_SubractandSum_LeetCode {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter a number:");

        int num=input.nextInt();

        String stringofNum=Integer.toString(num);

         int sum=0,product=1;

        for(int i=0;i<stringofNum.length();i++){

            String Each= stringofNum.substring(i,i+1);

            sum=sum+Integer.parseInt(Each);

            product=product*Integer.parseInt(Each);

        }

        System.out.println("Sum is:"+sum);
        System.out.println("Product is:"+product);

    }
}
