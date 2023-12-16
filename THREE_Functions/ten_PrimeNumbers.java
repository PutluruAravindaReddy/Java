package THREE_Functions;

//Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;
public class ten_PrimeNumbers {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter the lower bound : ");
        int smallest=input.nextInt();
        System.out.print("Enter the upper bound : ");
       int largest=input.nextInt();

        System.out.print("Prime numbers in the range"+" ["+smallest+","+largest+"] are :");
        for(int i=smallest;i<=largest;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
