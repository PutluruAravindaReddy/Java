package SIX_Recursion;

import java.util.Arrays;

public class FIVE_Reverse_String {
    public static void main(String[] args) {
        char[] s={'H','a','n','n','a','h'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
    public static void reverseString(char[] s){
        functionString(s,0,s.length-1);
    }
    public static void functionString(char[] s,int start,int end){
        if(start<end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            functionString(s,start+1,end-1);
        }else{
            return;
        }
    }
}
