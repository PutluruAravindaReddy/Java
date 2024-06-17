package SIX_Recursion;

import java.util.Arrays;

public class EIGHT_Recursive_Bubble_Sort {
    public static void main(String[] args) {
        int[] arr={1,0,4,3,2,8,5};
        System.out.println(Arrays.toString(RecBubbleSort(arr,0,0)));
    }
    public static int[] RecBubbleSort(int[] arr,int row,int col){
        if(col==arr.length-1){
            return arr;
        }
        if(arr.length - col-1 == row){
            return RecBubbleSort(arr,0,col+1);
        }
        if(arr[row]>arr[row+1]){
            int temp=arr[row];
            arr[row]=arr[row+1];
            arr[row+1]=temp;
        }
        return RecBubbleSort(arr,row+1,col);
    }

}
