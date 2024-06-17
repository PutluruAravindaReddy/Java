package SIX_Recursion;

public class SIX_Print_1_to_N {
    public static void main(String[] args) {
        int n=6;
        PrintValues(n);
    }
    public static void PrintValues(int n){
        if(n==0){
            return;
        }
        PrintValues(n-1);
        System.out.println(n);
    }
}
