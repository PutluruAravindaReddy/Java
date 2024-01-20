package FOUR_Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class twenty_two_UniqueIntegersSumUpToZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n value : ");
        int n= input.nextInt();
        System.out.println(Arrays.toString(sumZero(n)));
    }
    public static int[] sumZero(int n) {
        int[] temp=new int[n];

        for (int i=0;i<n;i++){
            temp[i]=2*i-n+1;
        }
        return temp;
    }
}
