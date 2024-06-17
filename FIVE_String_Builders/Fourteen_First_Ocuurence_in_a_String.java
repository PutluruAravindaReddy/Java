package FIVE_String_Builders;

public class Fourteen_First_Ocuurence_in_a_String {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));
    }
    public static int strStr(String haystack, String needle) {
        StringBuilder builder=new StringBuilder(haystack);
         if(haystack.contains(needle)){
             return builder.indexOf(needle);
         }
        return -1;
    }
}
