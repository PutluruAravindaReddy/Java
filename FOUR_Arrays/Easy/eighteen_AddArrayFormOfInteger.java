package FOUR_Arrays.Easy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class eighteen_AddArrayFormOfInteger {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the length of array : ");
        int[] num=new int[input.nextInt()];
        for (int i=0;i<num.length;i++){
            num[i]=input.nextInt();
        }
        System.out.print("Enter the value to added : ");
        int k=input.nextInt();
        System.out.println(addToArrayForm(num,k));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        String val="";

        for (int i=0;i<num.length;i++){
            val=val+Integer.toString(num[i]);
        }

        val= String.valueOf(k+Integer.parseInt(val));
        List<Integer> added=new ArrayList<>(val.length());
        for (int j=0;j<val.length();j++){
            added.add(Integer.parseInt(val.substring(j,j+1)));
        }
        return added;
    }
}
