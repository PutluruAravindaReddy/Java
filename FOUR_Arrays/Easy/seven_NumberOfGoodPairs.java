package FOUR_Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class seven_NumberOfGoodPairs {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the length of array : ");
        int[] nums=new int[input.nextInt()];
        System.out.print("Enter the values of array : ");
        for (int i=0;i<nums.length;i++){
            nums[i]=input.nextInt();
        }

        System.out.print(numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] nums) {
        int curr,count=0;

        for(int i=0;i<nums.length;i++){
            curr=nums[i];
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] && nums[i]<=nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
