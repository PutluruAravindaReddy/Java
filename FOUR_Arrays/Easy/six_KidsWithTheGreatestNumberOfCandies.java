package FOUR_Arrays.Easy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class six_KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the array list length : ");
        int n=input.nextInt();
        int[] candies= new int[n];

        for (int i=0;i<n;i++){
            candies[i]= input.nextInt();
        }

        System.out.print("Enter the extra candies : ");
        int extraCandies = input.nextInt();

        System.out.print(kidsWithCandies(candies,extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        List<Boolean> List=new ArrayList<>(candies.length);

        for(int i=1;i<candies.length;i++){
                max=Math.max(candies[i],max);
        }
        for (int i=0;i<candies.length;i++){
            List.add((candies[i]+extraCandies)>=max);
        }
        return List;
    }
}
