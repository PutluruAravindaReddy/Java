package FIVE_String_Builders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FIVE_Sorting_Sequence {
    public static void main(String[] args) {
        String s="is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s) {
        String str=" "+s;
        String[] parts = str.split("\\d+");

        Pattern pattern= Pattern.compile("\\d++");
        Matcher matcher= pattern.matcher(str);

        List<String> numbers=new ArrayList<>(20);

        while(matcher.find()) {
            numbers.add(matcher.group());
        }

        String[] arr=new String[numbers.size()];

        for(int i=0;i< arr.length;i++){
            arr[Integer.parseInt(numbers.get(i))-1]=parts[i];
        }

        String output=String.join("",arr);

        return output.trim();
    }
}
