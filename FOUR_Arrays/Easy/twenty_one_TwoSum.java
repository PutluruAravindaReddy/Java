package FOUR_Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class twenty_one_TwoSum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the length of array : ");
        int[] nums=new int[input.nextInt()];
        System.out.print("Enter the values of array : ");
        for (int i=0;i<nums.length;i++){
            nums[i]=input.nextInt();
        }
        System.out.print("Enter the target value : ");
        int target= input.nextInt();
        System.out.print(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] indexes=new int[2];
        int k=0;
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    indexes[k]=i;
                    indexes[k+1]=j;
                }
            }
        }
        return indexes;
    }
}
