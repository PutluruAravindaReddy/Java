package FIVE_String_Builders;

public class Thirteen_Excel_Sheet_Column_Title {
    public static void main(String[] args) {
        int columnNumber = 701;
        System.out.println(convertToTitle(columnNumber));
    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder builder=new StringBuilder();

        while(columnNumber>0){
            columnNumber--;
            int num=columnNumber%26;
            builder.append((char)(num +'A'));
            columnNumber /=26;
        }
        return builder.reverse().toString();
    }
}
