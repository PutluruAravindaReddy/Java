import java.util.Arrays;

public class Recursion_Patterns {
    public static void main(String[] args) {
        int r=0;
        int c=0;
        ReverseTraingle(r,c);
        int[] arr={3,5,4,2,6,7,1,0};
        bubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void ReverseTraingle(int r,int c){
        if(c==5){
            return;
        }
        if(r+c<=4){
            System.out.print("*");
            ReverseTraingle(r+1,c);
        }
        else{
            System.out.println();
            ReverseTraingle(0,c+1);
        }
    }
    public static void bubbleSort(int[] arr,int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubbleSort(arr,r,c+1);
        }
        else{
            bubbleSort(arr,r-1,0);
        }
    }
}
