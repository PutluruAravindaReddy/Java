package FOUR_Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class twenty_six_PlusOne {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the arrays size : ");
        int r= input.nextInt();

        int[] digits = new int[r];
        System.out.print("Enter the array values : ");
        for (int i=0;i<r;i++){
            digits[i]=input.nextInt();
        }
        System.out.print(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        for (int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] digi=new int[digits.length+1];
        digi[0]=1;
        return digi;
    }
}
