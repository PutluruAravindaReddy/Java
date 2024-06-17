package FIVE_String_Builders;

import java.util.HashMap;

public class Twenty_three_Roaman_to_integer {
    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s){
        HashMap<Character,Integer> map=new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int total=0;
        int prevValue=0;

        for(int i=s.length()-1;i>=0;i--){

            int currValue=map.get(s.charAt(i));

            if(currValue<prevValue){
                total -= currValue;
            } else {
                total += currValue;
            }
            prevValue=currValue;
        }
        return total;
    }
}
