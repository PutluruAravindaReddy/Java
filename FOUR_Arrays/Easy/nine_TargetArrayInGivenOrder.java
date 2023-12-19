package FOUR_Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class nine_TargetArrayInGivenOrder {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the length of nums array : ");
        int[] nums=new int[input.nextInt()];
        System.out.print("Enter the values nums array : ");
        for (int i=0;i<nums.length;i++){
            nums[i]=input.nextInt();
        }
        System.out.print("Enter the length of index array : ");
        int[] index=new int[input.nextInt()];
        System.out.print("Enter the values index array : ");
        for (int i=0;i<index.length;i++){
            index[i]=input.nextInt();
        }

        System.out.print(Arrays.toString(createTargetArray(nums,index)));
      }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target=new int[nums.length];

        for(int i=0;i<nums.length;i++){
               target= insertelement(target,nums[i],index[i]);
        }
        return target;
    }
    public static int[] insertelement(int arr[],int value,int index){
        for (int i=arr.length-1;i>index;i--){
             arr[i]=arr[i-1];
        }
        arr[index]=value;
        return arr;
    }

}
