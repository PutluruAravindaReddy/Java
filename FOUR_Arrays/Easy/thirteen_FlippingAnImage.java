package FOUR_Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class thirteen_FlippingAnImage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the row and column values : ");
        int r=input.nextInt(),c=input.nextInt();

        int[][] image=new int[r][c];
        System.out.print("Enter the value of array : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                image[i][j]= input.nextInt();
            }
        }
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(flipAndInvertImage(image)[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        image=reverse(image);

        int r=image.length;
        int c=image[0].length;

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (image[i][j]==0){
                    image[i][j]=1;
                }
                else{
                    image[i][j]=0;
                }
            }
            System.out.println();
        }
        return image;
    }
    public static int[][] reverse(int[][] arr){
        int temp,start,end;
        int r=arr.length;
        int c=arr[0].length;
        for (int i=0;i<r;i++){
            start=0;
            end=c-1;
            for(int j=0;j<c/2;j++){
                temp=arr[i][start];
                arr[i][start]=arr[i][end];
                arr[i][end]=temp;
                start++;
                end--;
            }
        }
        return arr;
    }
}
