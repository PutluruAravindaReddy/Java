package FOUR_Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class twenty_four_MaximumSubarray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the row and column values : ");
        int r=input.nextInt();

        int[] nums=new int[r];
        System.out.print("Enter the values of array : ");
        for (int i=0;i<r;i++){
                nums[i]=input.nextInt();
        }
        System.out.print(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int sum=0,max=Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}
