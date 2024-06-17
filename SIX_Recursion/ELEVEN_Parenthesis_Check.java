package SIX_Recursion;

public class ELEVEN_Parenthesis_Check {
    public static void main(String[] args) {
        String s="[()]{}{[()()]()}";
        System.out.println(isBalanced(s));
    }
    public static boolean isBalanced(String s){
        return ParenthesisCheck(s,0,0,0,0);
    }
    public static boolean ParenthesisCheck(String s,int index,int a,int b,int c){
        if(index==s.length()){
            return a==0&&b==0&&c==0;
        }

        if(a<0 || b<0 || c<0 ){
            return false;
        }

        switch(s.charAt(index)){
            case '[':
                return ParenthesisCheck(s,index+1,a+1,b,c);
            case ']':
                return ParenthesisCheck(s,index+1,a-1,b,c);
            case '{':
                return ParenthesisCheck(s,index+1,a,b+1,c);
            case '}':
                return ParenthesisCheck(s,index+1,a,b-1,c);
            case '(':
                return ParenthesisCheck(s,index+1,a,b,c+1);
            case ')':
                return ParenthesisCheck(s,index+1,a,b,c-1);
            default:
                return ParenthesisCheck(s,index+1,a,b,c);
        }

    }

}
