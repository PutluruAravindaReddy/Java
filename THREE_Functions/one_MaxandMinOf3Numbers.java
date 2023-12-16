package THREE_Functions;

//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;
public class one_MaxandMinOf3Numbers {
    public static int Largest(int a,int b, int c){
        int largest;
        if(a>b && a>c){
            largest = a;
        } else if (b>c){
            largest = b;
        } else{
            largest = c;
        }
        return largest;
    }
    public static int Smallest(int a,int b, int c){
        int smallest;
        if(a<b && a<c){
            smallest = a;
        } else if (b<c){
            smallest = b;
        } else{
            smallest = c;
        }
        return smallest;
    }

//    public static void MinandMaxArrays(int arr[],int max,int min,int length) {
//    or we can like this
public static void MinandMaxArrays(int arr[],int max,int min,int length) {
    for(int i=0;i<length;i++){
            if(i==0) {
                min = arr[i];
                max = arr[i];
            } else if (arr[i-1]<arr[i]) {
                max=arr[i];
            }
            else if (arr[i-1]>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Max among all numbers is : "+max);
        System.out.println("Min among all numbers is : "+min);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1.User defined length\n 2.Three Numbers\nEnter your choice : ");
        switch(input.nextInt()){
            case 1:
                System.out.print("Enter how many numbers : ");
                int length=input.nextInt(),min=0,max=0;
                 int arr[]=new int[length];
                System.out.print("Enter the values : ");
                 for (int i=0;i<length;i++) {
                     arr[i] = input.nextInt();
                 }
                 MinandMaxArrays(arr,max,min,length);
                break;
            case 2:
                System.out.print("Enter 3 Numbers : ");
                int a=input.nextInt(),b=input.nextInt(),c=input.nextInt();
                System.out.println("Largest among 3 number is : "+Largest(a,b,c));
                System.out.println("Smallest among 3 numbers is : "+Smallest(a,b,c));
                break;
            default:
                System.out.print("Invalid Choice");
        }
    }
}
