import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int[] out=MergeSort(arr);
        System.out.println(Arrays.toString(out));
    }
    public static int[] MergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }

        int mid=arr.length/2;

        int[] left=MergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=MergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return Merge(left,right);
    }
    public static int[] Merge(int[] left,int[] right){

        int[] mix=new int[left.length+right.length];

        int i=0,j=0,k=0;

        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }

        while(i<left.length){
            mix[k]=left[i];
            k++;
            i++;
        }

        while(j<right.length){
            mix[k]=left[j];
            k++;
            j++;
        }

        return mix;
    }

}
