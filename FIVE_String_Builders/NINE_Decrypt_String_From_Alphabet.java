package FIVE_String_Builders;

public class NINE_Decrypt_String_From_Alphabet {
    public static void main(String[] args) {
        String s="10#11#12";
        System.out.println(freqAlphabets(s));
    }
    public static String freqAlphabets(String s) {
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<s.length();){
            if(i+2<s.length() && s.charAt(i+2)=='#'){
                int val=Integer.parseInt(s.substring(i,i+2));
                builder.append((char)(val+96));
                i=i+3;
            }
            else{
                int val = s.charAt(i) - '0';
                builder.append((char) (val + 'a' - 1));
                i++;
            }
        }
        return builder.toString();
    }
}
