package FOUR_Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class twenty_seven_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the length of array : ");
        int n=input.nextInt();

        int[] nums=new int[n];
        System.out.print("Enter the elements of array : ");
        for (int i=0;i<n;i++){
            nums[i]=input.nextInt();
        }
        for (int k=0;k<removeDuplicates(nums);k++){
            System.out.print(nums[k]+" ");
        }
    }
    //we need to update the same array
    public static int removeDuplicates(int[] nums) {
        int j=0;
        for (int i=0;i<nums.length;i++){
            if (nums[j]!=nums[i]){
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1;
    }
}
