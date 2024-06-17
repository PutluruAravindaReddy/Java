package SIX_Recursion;

public class TEN_Power_Of_two {
    public static void main(String[] args) {
        int n=16;
        System.out.println(isPowerOfTwo(n));
    }
        public static boolean isPowerOfTwo(int n) {
            return helper(n,0);
        }
        public static boolean helper(int n,int index){
            if(Math.pow(2,index)>n){
                return false;
            }
            if(Math.pow(2,index)==n){
                return true;
            }
           return  helper(n,index+1);
        }
        //another easy way
//    public bool IsPowerOfTwo(int n) {
//        if (n<1)return false;
//        if(n==1)return true;
//        if(n%2==1)return false;
//        return IsPowerOfTwo( n/2);
//    }
}
