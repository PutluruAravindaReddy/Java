package FOUR_Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class two_ConcatenationOfArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the Size of Array : ");
        int[] nums = new int[input.nextInt()];
        System.out.print("Enter the Array Values : ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans=new int[nums.length*2];
        for (int i=0;i< ans.length/2;i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
        return ans;
    }
}

//Leetcode solution
//class Solution {
//    public int[] getConcatenation(int[] nums) {
//        int[] ans=new int[nums.length*2];
//        for (int i=0;i< ans.length/2;i++){
//            ans[i]=nums[i];
//            ans[i+nums.length]=nums[i];
//        }
//        return ans;
//    }
//}
