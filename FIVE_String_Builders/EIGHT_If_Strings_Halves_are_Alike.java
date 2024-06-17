package FIVE_String_Builders;

public class EIGHT_If_Strings_Halves_are_Alike {
    public static void main(String[] args) {
        String s="book";
        System.out.println(halvesAreAlike(s));
    }
    public static boolean halvesAreAlike(String s) {
        String s1=s.substring(0,s.length()/2);
        String s2=s.substring(s.length()/2,s.length());

        return vowelCount(s1)==vowelCount(s2);
    }

    public static int vowelCount(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                count++;
            }
        }
        return count;
    }
}
