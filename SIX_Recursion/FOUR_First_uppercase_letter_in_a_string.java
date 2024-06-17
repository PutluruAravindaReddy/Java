package SIX_Recursion;

public class FOUR_First_uppercase_letter_in_a_string {
    public static void main(String[] args) {
        String s= "geeksforgeeKs";
        int index=0;
        System.out.print(isUpperCase(s,index));
        System.out.println(UpperCaseChar(s,0));
    }
    public static String isUpperCase(String s,int index){
        if(index==s.length()){
            return null;
        }
        String a=s.substring(index,index+1);
        if((a.toUpperCase()).equals(a)){
            return a;
        }
        return isUpperCase(s,index+1);
    }
    public static Character UpperCaseChar(String s,int index){
        if(index==s.length()){
            return null;
        }
        char a=s.charAt(index);
        if(Character.isUpperCase(a)){
            return a;
        }
        return UpperCaseChar(s,index+1);
    }
}
