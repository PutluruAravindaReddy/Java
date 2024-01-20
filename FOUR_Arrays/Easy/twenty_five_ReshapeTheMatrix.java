package FOUR_Arrays.Easy;

import java.util.Scanner;

public class twenty_five_ReshapeTheMatrix {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the row and column values : ");
        int rm= input.nextInt(),cm= input.nextInt();

        int[][] mat=new int[rm][cm];
        System.out.print("Enter the values of array : ");
        for (int i=0;i<rm;i++){
            for (int j=0;j<cm;j++){
                mat[i][j]= input.nextInt();
            }
        }
        System.out.print("Enter the row and column values of output array : ");
        int r= input.nextInt(),c= input.nextInt();
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(matrixReshape(mat ,r,c)[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows=mat.length;
        int cols=mat[0].length;
        int[][] output=new int[r][c];
        int out_rows=0;
        int out_cols=0;
        if((rows * cols) != (r * c)) return mat;
        for (int i=0;i<rows;i++) {
            for (int j = 0; j < cols; j++) {
                output[out_rows][out_cols] = mat[i][j];
                out_cols++;
                if (out_cols == c) {
                    out_cols = 0;
                    out_rows++;
                }
            }
        }
        return output;
    }
}
