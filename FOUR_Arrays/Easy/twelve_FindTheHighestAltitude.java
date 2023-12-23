package FOUR_Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class twelve_FindTheHighestAltitude {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the length of array : ");
        int len=input.nextInt();
        int[] gain=new int[len];
        System.out.print("Enter the values of array : ");
        for (int i=0;i<gain.length;i++){
            gain[i]=input.nextInt();
        }

        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int[] altitude=new int[gain.length+1];
        int max=0;
        altitude[0]=0;
        for(int i=1;i<altitude.length;i++){
            altitude[i]=altitude[i-1]+gain[i-1];
            max=Math.max(max,altitude[i]);
        }
        return max;
    }
}
