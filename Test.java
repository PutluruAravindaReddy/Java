import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] arr={32, 135, 424, 414, 513, 2133, 69583, 138293};
//            Integer number = Integer.valueOf(str.substring(0,1));
        int k=3;
        System.out.println(FindK(arr,k));
    }
    public static int FindK(int[] arr,int k){
        return CountNum(arr,k,0,0,0);
    }
    public static int CountNum(int[] arr,int k,int row,int col,int count){
        if(col==arr.length){
            return count;
        }
        String num=String.valueOf(arr[col]);
        if(row<num.length()){
            char curr=num.charAt(row);
            int currNum=Character.getNumericValue(curr);
            if(currNum==k){
                return CountNum(arr,k,row+1,col,count+1);
            }
            return CountNum(arr,k,row+1,col,count);
        }
        return CountNum(arr,k,0,col+1,count);
    }
    public static int KnapSack(int W,int[] weight,int[] values){
        int n=weight.length;
        int[] dp=new int[W+1];

        for(int i=0;i<n;i++){
            for(int w=W;w>=weight[i];w--){
                dp[w]=Math.max(dp[w],dp[w-weight[i]]+values[i]);
            }
        }

        return dp[W];
    }
}



