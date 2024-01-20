package FOUR_Arrays.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class first_spiralMatrix {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the row and col values : ");
        int r=input.nextInt(),c= input.nextInt();

        int[][] matrix = new int[r][c];
        System.out.print("Enter the values of matrix : ");
        for (int row=0;row<r;row++){
            for(int col=0;col<c;col++){
                matrix[row][col]=input.nextInt();
            }
        }
        System.out.print(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int r= matrix.length,c=matrix[0].length;
        List<Integer> ans=new ArrayList<>();
        int start=0,end=matrix[0].length-1;

        while(start<=end){
            for (int j=start;j<end;j++){
                    ans.add(matrix[start][j]);
            }
            for (int j=start;j<end;j++){
                ans.add(matrix[j][end]);
            }
            for (int j=end;j>start;j--){
                ans.add(matrix[end][j]);
            }
            for (int j=end;j>start;j--){
                ans.add(matrix[j][start]);
            }
            start++;
            end--;
        }
        return ans;
    }
}
