package FIVE_String_Builders;

public class Eleven_Robot_Return_To_Origin {
    public static void main(String[] args) {
        String moves="LL";
        System.out.println(judgeCircle(moves));
    }
    public static boolean judgeCircle(String moves) {
        int u=0,d = 0,l=0,r=0;

//        for(int i=0;i<moves.length();i++) {
//            switch(moves.charAt(i)){
//                case('U') : u++; break;
//                case('D') : d++; break;
//                case('L') : l++; break;
//                case('R') : r++; break;
//            }
//        }
        // or
        char[] arr=moves.toCharArray();
        for (char s:arr){
            switch(s){
                case('U') : u++; break;
                case('D') : d++; break;
                case('L') : l++; break;
                case('R') : r++; break;
            }
        }
        return u==d &&r==l;
    }
}
