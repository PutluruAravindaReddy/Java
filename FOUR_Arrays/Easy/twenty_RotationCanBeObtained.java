package FOUR_Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class twenty_RotationCanBeObtained {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the row and column values : ");
        int r= input.nextInt(),c= input.nextInt();

        int[][] mat=new int[r][c];
        int[][] target=new int[r][c];
        System.out.print("Enter the mat array values : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=input.nextInt();
            }
        }
        System.out.print("Enter the target array values : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                target[i][j]=input.nextInt();
            }
        }

        System.out.println(findRotation(mat,target));

    }
    public static boolean findRotation(int[][] mat, int[][] target) {
        for (int k = 0; k <= 3; k++) {
            mat = rotate(mat);
            if (Arrays.deepEquals(mat,target)) {
                return true;
            }
        }
        return false;
    }
    public static int[][] rotate(int[][] arr){
        int r=arr.length,c=arr[0].length;
        int[][] temp=new int[r][c];
        for (int i=0;i<c;i++){
            int k=0;
            for (int j=r-1;j>=0;j--){
                temp[i][k]=arr[j][i];
                k++;
            }
        }
        return temp;
    }
//    public static boolean isEqual(int[][] arr1, int[][] arr2) {
//        int r = arr1.length, c = arr1[0].length;
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c; j++) {
//                if (arr1[i][j] != arr2[i][j]) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
}
