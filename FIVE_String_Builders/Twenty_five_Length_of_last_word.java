package FIVE_String_Builders;

public class Twenty_five_Length_of_last_word {
    public static void main(String[] args) {
        String s = "Hello World   ";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        s=s.trim();
        String[] arr=s.split(" ");
        return arr[arr.length-1].length();
    }
}
