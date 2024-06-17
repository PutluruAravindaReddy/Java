package SIX_Recursion;

//Input : A = {1, 2, 3, 4, 5}
//Output : [48]
//        [20, 28]
//        [8, 12, 16]
//        [3, 5, 7, 9]
//        [1, 2, 3, 4, 5]
//
//Explanation :
//Here,   [48]
//        [20, 28] -->(20 + 28 = 48)
//        [8, 12, 16] -->(8 + 12 = 20, 12 + 16 = 28)
//        [3, 5, 7, 9] -->(3 + 5 = 8, 5 + 7 = 12, 7 + 9 = 16)
//        [1, 2, 3, 4, 5] -->(1 + 2 = 3, 2 + 3 = 5, 3 + 4 = 7, 4 + 5 = 9)

import java.util.ArrayList;
import java.util.Arrays;

public class ONE_Sum_Triangle_From_Array {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};
        SumTriangle(arr);
    }
    public static void SumTriangle(int[] arr){
        if(arr.length==1){
            System.out.println(Arrays.toString(arr));
            return ;
        }

        int[] newarr=new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            newarr[i]=arr[i]+arr[i+1];
        }

        SumTriangle(newarr);
        System.out.println(Arrays.toString(arr));
    }
}
