package FOUR_Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class three_SumOfArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the Size of Array : ");
        int[] nums = new int[input.nextInt()];
        System.out.print("Enter the Array Values : ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums) {
        for(int i = 1 ; i < nums.length ; i++){
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }
}

//Leet code very good solution
//
//public static int[] runningSum(int[] nums) {
//    int[] ans=new int[nums.length];
//    int sum=0;
//    for (int i=0;i<ans.length;i++){
//        ans[i]=nums[i]+sum;
//        sum=sum+nums[i];
//    }
//    return ans;
//}