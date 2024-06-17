package FIVE_String_Builders.medium;

public class Two_Split_two_Strings_to_make_palindrome {
    public static void main(String[] args) {
        String a = "xbdef", b = "xecab";
        System.out.println(checkPalindromeFormation(a, b));
    }

    public static boolean checkPalindromeFormation(String a, String b) {
        return isValid(a,b) || isValid(b,a);
    }
    public static boolean isValid(String a,String b){
        int left=0,right=a.length()-1;

        while(left<right && a.charAt(left) == b.charAt(right)){
            left++;
            right--;
        }

        return isPalindrome(a,left,right) || isPalindrome(b,left,right);
    }
    public static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
