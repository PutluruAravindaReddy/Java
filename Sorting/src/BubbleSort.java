public class BubbleSort {
    public static void main(String args[]){
        int[] arr={3,6,2,1,8,7,4,5,3,1};

        BubblesortDescendingOrder(arr);
        printArray(arr);
        System.out.println();
        BubblesortAscendingOrder(arr);
        printArray(arr);
    }

    public static void BubblesortAscendingOrder(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (arr[i]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
    public static void BubblesortDescendingOrder(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
    public static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
