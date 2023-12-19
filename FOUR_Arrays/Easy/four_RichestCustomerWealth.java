package FOUR_Arrays.Easy;

import java.util.Arrays;
import java.util.*;

public class four_RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Size of m and n Array : ");
        int m = input.nextInt(), n = input.nextInt();
        int[][] accounts = new int[m][n];
        System.out.println("Enter the Array Values : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter the accounts[" + i + "][" + j + "] : ");
                accounts[i][j] = input.nextInt();
            }
        }
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int wealth=0;
        int m= accounts.length;
        int n=accounts[0].length;
        for (int i = 0; i <m; i++) {
            int temp=0;
            for (int j = 0; j < n; j++) {
                temp = temp + accounts[i][j];
            }
            wealth=Math.max(wealth,temp);
        }
        return wealth;
    }
}

//    public static int maximumWealth(int[][] accounts) {
//        int wealth = 0, temp = 0;
//        int m = accounts.length;
//        int n = accounts[0].length;
//        for (int i = 0; i < m; i++) {
//            temp = 0;
//            for (int j = 0; j < n; j++) {
//                temp = temp + accounts[i][j];
//            }
//            if (temp > wealth) {
//                wealth = temp;
//            }
//        }
//        return wealth;
//    }
