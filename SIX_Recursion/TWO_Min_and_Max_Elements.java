package SIX_Recursion;

public class TWO_Min_and_Max_Elements {
    public static void main(String[] args) {
        int[] arr={1, 4, 45, 6, 10, -8};
        MaxandMin(arr,0,arr[0],arr[0]);
    }
    public static void MaxandMin(int[] arr,int index,int min,int max){
        if(index==arr.length){
            System.out.println("Min = "+min);
            System.out.println("Max = "+max);
            return ;
        }
            max=Math.max(arr[index],max);
            min=Math.min(arr[index],min);

        MaxandMin(arr,index+1,min,max);
    }
}
