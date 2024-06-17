package FIVE_String_Builders;

public class Fifteen_Long_Pressed {
    public static void main(String[] args) {
        String name = "leelee";
        String typed = "lleeelee";
        System.out.println(isLongPressedName( name, typed));
    }
    public static boolean isLongPressedName(String name, String typed) {
                int i=0,j=0;
                while(j<typed.length()){
                    if(i<name.length() && name.charAt(i)==typed.charAt(j)){
                        i++;
                        j++;
                    }
                    else if(j>0 && typed.charAt(j)==typed.charAt(j-1)) {
                        j++;
                    }
                    else{
                        return false;
                    }
                }
                return i==name.length();
            }
        }

