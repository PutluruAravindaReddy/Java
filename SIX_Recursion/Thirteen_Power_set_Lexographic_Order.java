package SIX_Recursion;

import java.util.ArrayList;
import java.util.*;

//public class Thirteen_Power_set_Lexographic_Order {
//    public static void main(String[] args) {
//        String s="abc";
//        System.out.println(PowerSet(s));
//    }
//    public static ArrayList<String> PowerSet(String s){
//        return helper(s,0,1,new ArrayList<String>());
//    }
//    public static ArrayList<String> helper(String s,int col,int row,ArrayList<String> list){
//        if(s.length()==row-1){
//            return helper(s,col+1,col+2,list);
//        }
//        list.add(s.substring(col,row));
//        if(col==s.length()-1){
//            return list;
//        }
//        return helper(s,col,row+1,list);
//    }
//}

public class Thirteen_Power_set_Lexographic_Order {
    public static void main(String[] args) {
        String s="aaabbaaa";
        System.out.println(isLexographic(s));
    }
    public static int isLexographic(String s){
        int count=0;
        int sum=1;
        for(int i=0;i<s.length();){
            count=1;
            for(int j=i;j<s.length()-1;j++){
                if(s.charAt(j) == s.charAt(j+1)){
                    count++;
                }else{
                    break;
                }
            }
            i=i+count;
            sum=(sum*count)%1007;
        }
        return sum;
    }
}

