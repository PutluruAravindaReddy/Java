package First_Java_Program;//Input currency in rupees and output in USD.

import java.util.Scanner;

public class six_RupeesToUsd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the value in rupees:");
        float rupees= input.nextFloat();
        float exchangerate=0.012f;

        float usd=rupees*exchangerate;
        System.out.println("For"+rupees+"rupee the us dollar value is "+usd);
    }
}
