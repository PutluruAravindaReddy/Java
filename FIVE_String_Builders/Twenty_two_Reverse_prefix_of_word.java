package FIVE_String_Builders;

public class Twenty_two_Reverse_prefix_of_word {
    public static void main(String[] args) {
        String  word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }
    public static String reversePrefix(String word, char ch) {
        int index=word.indexOf(ch);
        if(index==-1){
            return word;
        }
        String Brev=word.substring(0,index+1);
        StringBuilder builder=new StringBuilder(Brev);
        String rev=builder.reverse().toString();
        return rev+word.substring(word.indexOf(ch)+1,word.length());
    }
}
