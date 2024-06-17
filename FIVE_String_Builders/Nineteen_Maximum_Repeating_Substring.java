package FIVE_String_Builders;

public class Nineteen_Maximum_Repeating_Substring {
    public static void main(String[] args) {
        String sequence = "ababc", word = "ab";
        System.out.println(maxRepeating(sequence, word));
    }
    public static int maxRepeating(String sequence, String word) {
        StringBuilder builder=new StringBuilder(word);
        int count=0;
        while(sequence.contains(builder)){
            count++;
            builder.append(word);
        }
        return count;
    }
}
