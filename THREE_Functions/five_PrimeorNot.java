package THREE_Functions;

//Define a method to find out if a number is prime or not.

import java.util.Scanner;

public class five_PrimeorNot {
    public static boolean isPrime(int num){
        if (num<=1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num=input.nextInt();
        if(isPrime(num)){
            System.out.print(num +" is a prime number.");
        }
        else{
            System.out.print(num +" is Not a prime number.");
        }
    }
}
