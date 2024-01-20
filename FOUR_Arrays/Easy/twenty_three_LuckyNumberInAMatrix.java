package FOUR_Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class twenty_three_LuckyNumberInAMatrix {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the row and column values : ");
        int r= input.nextInt(),c=input.nextInt();
        System.out.print("Enter the values of array : ");
        int[][] matrix=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]=input.nextInt();
            }
        }
        System.out.println(luckyNumbers(matrix));
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        int r=matrix.length,c=matrix[0].length,rowleast;
        int[] rl=new int[r];
        int[] ch=new int[c];
        List<Integer> lucky=new ArrayList<>(2);

        for (int i=0;i<r;i++){
            rowleast=matrix[i][0];
            for (int j=0;j<c;j++){
                rowleast=Math.min(rowleast,matrix[i][j]);
                ch[j]=Math.max(matrix[i][j],ch[j]);
            }
            rl[i]=rowleast;
        }
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if(rl[i]==ch[j]){
                    lucky.add(rl[i]);
                }
            }
        }
        return lucky;
    }
}


//Best solution
//public static int findLucky(int[] arr) {
//    Arrays.sort(arr);
//    int ans = 0;
//    for (int i = arr.length - 1; i >= 0; i--) {
//        ans++;
//        if (i == 0 || arr[i] != arr[i - 1]) {
//            if (ans == arr[i]) {
//                return ans;
//            }
//            ans = 0;
//        }
//    }
//    return -1;
//}
// 3 7 8 9 11 13 15 16 17