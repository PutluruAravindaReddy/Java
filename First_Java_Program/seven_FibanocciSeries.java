package First_Java_Program;

import java.util.Scanner;

public class seven_FibanocciSeries {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter n value:");
        int n=input.nextInt();

        int prevprev=0,prev=1,curr;

        System.out.println(prevprev+" "+prev);

        for(int i=2;i<n;i++){

            curr = prev + prevprev;

            prevprev = prev;

            prev = curr;

            System.out.print(curr+" ");
        }
    }
}
