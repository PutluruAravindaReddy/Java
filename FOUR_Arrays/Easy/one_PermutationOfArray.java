package FOUR_Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class one_PermutationOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Size of Array : ");
        int[] nums = new int[input.nextInt()];
        System.out.print("Enter the Array Values : ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(buildArray(nums)));

//        for (int i=0;i<nums.length;i++){
//            System.out.print(buildArray(nums)[i]+" ");
//        }
    }
    public static int[] buildArray(int[] nums){
        int[] ans=new int[nums.length];
        for (int i=0;i<ans.length;i++){
                ans[i] = nums[nums[i]];
        }
        return ans;
    }
}

//Leet code solution
//
//class Solution {
//    public int[] buildArray(int[] nums) {
//        int[] ans=new int[nums.length];
//        for(int i=0;i<ans.length;i++){
//            ans[i] = nums[nums[i]];
//        }
//        return ans;
//    }
//}