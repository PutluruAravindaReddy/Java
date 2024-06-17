package FIVE_String_Builders;

public class Twelve_Reverse_words {
    public static void main(String[] args) {
        String s = "s'teL ekat edoCteeL tsetnoc";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] arr=s.split(" ");
        StringBuilder builder=new StringBuilder();
        for (String words:arr){
            builder.append(new StringBuilder(words).reverse()).append(" ");
        }
        return builder.toString().trim();
    }
}
