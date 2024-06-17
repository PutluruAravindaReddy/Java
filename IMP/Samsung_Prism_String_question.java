package IMP;


//Steps:
//
//        "aaa" -> 3
//        "bb" -> 2
//        "c" -> 1
//        "aaa" -> 3

//Result calculation:

//Initial result = 1
//After first "aaa": result = 1 * 3 mod 1007 = 3
//After "bb": result = 3 * 2 mod 1007 = 6
//After "c": result = 6 * 1 mod 1007 = 6
//After "aaa": result = 6 * 3 mod 1007 = 18

//So, the output for the input "aaabbcaaa" is 18.


public class Samsung_Prism_String_question {
    public static void main(String[] args) {
        String s="aaabbcaaa";
        System.out.println(isLexographic(s));
    }
    public static int isLexographic(String s){
        int count=0;
        int sum=1;
        for(int i=0;i<s.length();){
            count=1;
            for(int j=i;j<s.length()-1;j++){
                if(s.charAt(j) == s.charAt(j+1)){
                    count++;
                }else{
                    break;
                }
            }
            i=i+count;
            sum=(sum*count)%1007;
        }
        return sum;
    }
}
