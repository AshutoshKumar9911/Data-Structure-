package LeetCode_Problem_Using_BinarySearch;

public class Search_Insert_Position {
    public static void main(String[] args) {
        int[] nums = {2,4,7,8,9};
        int target = 10;
        System.out.println(searchInsert(nums,target));;

    }
    public static int searchInsert(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = low +(high-low)/2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid]<target) {
                low = mid+1;
            }
            else {
                high = mid - 1;
            }
        }
        return low;
    }
}
