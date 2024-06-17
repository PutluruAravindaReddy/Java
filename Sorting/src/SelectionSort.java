public class SelectionSort {
    public static void main(String args[]){
        int[] arr={3,6,2,1,8,7,4,5,3,1};

        SelectionsortDescendingOrder(arr);
        printArray(arr);
        System.out.println();
        SelectionsortAscendingOrder(arr);
        printArray(arr);
    }

    public static void SelectionsortAscendingOrder(int[] arr){
        for (int i=0;i<arr.length;i++){
            int small=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[small]>arr[j]){
                    small=j;
                }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
    }
    public static void SelectionsortDescendingOrder(int[] arr){
        for (int i=0;i<arr.length;i++){
            int small=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[small]<arr[j]){
                    small=j;
                }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
