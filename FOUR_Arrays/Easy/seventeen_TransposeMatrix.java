package FOUR_Arrays.Easy;

import java.util.Scanner;

public class seventeen_TransposeMatrix {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the row and column values : ");
        int r=input.nextInt(),c=input.nextInt();

        int[][] matrix=new int[r][c];
        System.out.print("Enter the values of array : ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]=input.nextInt();
            }
        }
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(transpose(matrix)[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int r=matrix.length,c=matrix[0].length;
        int[][] transpose=new int[c][r];

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        return transpose;
    }
}
