package FIVE_String_Builders;

public class SIX_Two_Strings_are_Equivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println();
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1=String.join("",word1);
        String str2=String.join("",word2);

        return str1.equals(str2);
        // or
//        StringBuilder st1 = new StringBuilder();
//        StringBuilder st2 = new StringBuilder();
//
//        for(int i = 0 ; i < word1.length ; i++)
//        {
//            st1.append(word1[i]);
//        }
//        for(int i = 0 ; i < word2.length ; i++)
//        {
//            st2.append(word2[i]);
//        }
//        String w1 = st1.toString();
//        String w2 = st2.toString();
//
//        return w1.equals(w2);
    }
}
