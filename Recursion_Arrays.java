import java.util.ArrayList;

public class Recursion_Arrays {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int index=0;
        System.out.println(Sort(arr,index));
        System.out.println(Search(arr,8,index));
        System.out.println(SearchIndex(arr,7,index));
        int[] arr2={1,2,4,4,5,4,6,7};
        SearchIndexes(arr2,4,index);
        System.out.println(list);
        System.out.println("---------------------------");
        ArrayList<Integer> list=SearchIndexeslist(arr2,4,index,new ArrayList<>());
        System.out.println(list);
        //    or
//        ArrayList<Integer> example=new ArrayList<>();
//        ArrayList<Integer> called=SearchIndexeslist(arr2,4,index,example);
//        System.out.println(called);
//        System.out.println(example);
//          Both called and example will have same value after excution
    }
    public static boolean Sort(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && Sort(arr,index+1);
    }
    public static boolean Search(int[] arr,int target,int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || Search(arr,target,index+1);
    }
    // To find index
    public static int SearchIndex(int[] arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return SearchIndex(arr,target,index+1);
        }
    }
    static ArrayList<Integer> list=new ArrayList<>();
    public static void SearchIndexes(int[] arr,int target,int index){
        if(index==arr.length){
            return ;
        }
        if(arr[index]==target){
            list.add(index);
        }
            SearchIndexes(arr,target,index+1);
    }

    public static ArrayList<Integer> SearchIndexeslist(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return SearchIndexeslist(arr,target,index+1,list);
    }
}
