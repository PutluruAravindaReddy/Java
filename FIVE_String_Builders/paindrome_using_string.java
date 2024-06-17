package FIVE_String_Builders;


public class paindrome_using_string {
    public static void main(String[] args) {
        String str = "Aravivara";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str){
        // First it should be null always if we keep str.length then null it gives error
        //This condition checking is also important for interview preparation
        if(str == null || str.isEmpty() ){  //  or  str.length()==0
            return true;
        }
        str=str.toLowerCase();
        for(int i = 0 ; i <= str.length() / 2 ;i++){
            char start=str.charAt(i);
            char end=str.charAt(str.length() - 1 - i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}
