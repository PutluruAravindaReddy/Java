package FIVE_String_Builders;

public class Twenty_one_Merge_strings_Alternatively {
    public static void main(String[] args) {
        String word1 = "abc",word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder builder=new StringBuilder();
        int i=0;
 while(i<word1.length() || i<word2.length()){
     if(i<word1.length()){
         builder.append(word1.charAt(i));
     }
     if(i<word2.length()){
         builder.append(word2.charAt(i));
     }
     i++;
 }
 return builder.toString();
    }
}
