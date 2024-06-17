package FIVE_String_Builders;
import java.lang.Integer;
import java.util.ArrayList;

public class Strings_concept {
    public static void main(String[] args) {
        String a ="Aravind";
        String b="Aravind";

        System.out.println(a == b);

        //this type it will create only one object and points all aravind variables to it . that's is the reason it will give true

        String ab=new String("Aravind");
        String bb=new String("Aravind");

        System.out.println(ab == bb);

        //In this case it we are creating multiple objects and so it will return false to check objects are euqla or not we use

        System.out.println(ab.equals(bb));

        //To get the value at particular index letter we can use
        //Internally it will be like array but we cant use " ab[0] "
        System.out.println(ab.charAt(0));

        System.out.println(new Integer(50)+" "+new ArrayList<>());
    }
}
