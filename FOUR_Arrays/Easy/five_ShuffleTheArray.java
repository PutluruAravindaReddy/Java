package FOUR_Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class five_ShuffleTheArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter length of array (Length should be even) : ");
        int n=input.nextInt();
        int[] nums=new int[n*2];
        System.out.println("Enter the values of array : ");
        for (int i=0;i<nums.length;i++) {
            System.out.print("Enter value of nums[" + i + "] : ");
            nums[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        System.out.print(Arrays.toString(shuffle(nums,n)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] shuffle=new int[n*2];
        int x=0,y=n;
        for (int i=0;i< shuffle.length;i++){
            if(i%2==0){
                shuffle[i]=nums[x];
                x++;
            }
            else{
                shuffle[i]=nums[y];
                y++;
            }
        }
        return shuffle;
    }
}
