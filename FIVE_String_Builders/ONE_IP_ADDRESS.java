package FIVE_String_Builders;

public class ONE_IP_ADDRESS {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr1(address));
        System.out.println(defangIPaddr2(address));
    }


    public static String defangIPaddr1(String address) {
        return address.replace(".", "[.]");
    }
    public static String defangIPaddr2(String address){
        StringBuilder builder = new StringBuilder();
        char dot='.';
        for(int i=0;i< address.length() ;i++){
            if(address.charAt(i)=='.'){
                builder.append("[.]");
            }
            else{
                builder.append(address.charAt(i));
            }
        }

        return builder.toString();
    }
}
