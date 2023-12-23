package FOUR_Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class sixteen_EvenNumberOfDigits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int n=input.nextInt();

        int[] nums=new int[n];
        System.out.print("Enter the values of array : ");
        for (int i=0;i<n;i++){
            nums[i]=input.nextInt();
        }
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count=0;
        for (int i=0;i<nums.length;i++){
            if (Integer.toString(nums[i]).length()%2==0){
                count++;
            }
        }
        return count;
    }
}
