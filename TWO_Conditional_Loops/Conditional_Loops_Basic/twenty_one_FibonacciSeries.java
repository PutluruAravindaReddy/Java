package TWO_Conditional_Loops.Conditional_Loops_Basic;

import java.util.Scanner;
public class twenty_one_FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n:");
        int n= input.nextInt();
        int prevprev = 0, prev = 1, curr = 0;

        System.out.print(prevprev+" "+prev+" ");

        for (int i=2;i<n;i++){

            curr=prevprev+prev;

            prevprev=prev;

            prev=curr;

            System.out.print(curr+" ");
        }

    }
}
