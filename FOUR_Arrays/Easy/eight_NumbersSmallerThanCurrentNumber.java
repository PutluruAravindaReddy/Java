package FOUR_Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class eight_NumbersSmallerThanCurrentNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the length of array : ");
        int[] nums=new int[input.nextInt()];
        System.out.print("Enter the values of array : ");
        for (int i=0;i<nums.length;i++){
            nums[i]=input.nextInt();
        }

        System.out.print(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            count[i]=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    count[i]++;
                }
            }
        }
        return count;
    }
}
