package SIX_Recursion;

public class THREE_Binary_Search {
    public static void main(String[] args) {
        int[] nums={-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
//        int start=0;
//        int end=nums.length-1;
//
//        while(start<=end){
//            int mid=(start+end)/2;
//
//            if(nums[mid]==target){
//                return mid;
//            }
//            if(target>nums[mid]){
//                start=mid+1;
//            }
//            else{
//                end=mid-1;
//            }
//        }
//        return -1;
//        Using Recursion
        return SearchRecursion(nums,target,0,nums.length-1);
    }

    private static int SearchRecursion(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid=start+(end-start)/2;

        if(nums[mid]==target){
            return mid;
        }
        if(nums[mid]>target){
            return SearchRecursion(nums,target,start,mid-1);
        }
        else{
            return SearchRecursion(nums,target,mid+1,end);
        }
    }

}
