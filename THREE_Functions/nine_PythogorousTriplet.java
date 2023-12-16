package THREE_Functions;

//Write a function to check if a given triplet is a Pythagorean triplet or not.(A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

import java.util.Scanner;
public class nine_PythogorousTriplet {
    public static void Pythagorous_Triplet(int ac,int ab,int bc){
        if(Math.pow(ac,2)==Math.pow(ab,2)+Math.pow(bc,2)){
            System.out.println("Entered values are Pythogorous triplets.");
        }
        else{
            System.out.println("Entered values are Not Pythagorous triplets.");
        }
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter AC value : ");
        int ac= input.nextInt();
        System.out.print("Enter AB value : ");
        int ab=input.nextInt();
        System.out.print("Enter bc value : ");
        int bc=input.nextInt();

        Pythagorous_Triplet(ac,ab,bc);

    }
}
