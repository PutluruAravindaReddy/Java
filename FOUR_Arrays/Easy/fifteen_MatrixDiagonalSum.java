package FOUR_Arrays.Easy;

import java.util.Scanner;

public class fifteen_MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.print("Enter the row and column values : ");
        int r=input.nextInt(),c=input.nextInt();

        int[][] mat=new int[r][c];
        System.out.println("Enter the value of array : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]= input.nextInt();
            }
        }
        System.out.print(diagonalSum(mat));
    }
    public static int diagonalSum(int[][] mat) {
        int r=mat.length,c=mat[0].length,sum=0;

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (i==j || i+j==r-1 ){
                    sum=sum+mat[i][j];
                }
            }
        }
        return sum;
    }
}
