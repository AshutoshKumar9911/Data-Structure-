// Leet Code problem 704
// Binary Search

package LeetCode_Problem_BinarySearch;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,9,11};
        int target = 11;
        int ans = binary_Search(arr,target);
        System.out.println(ans);
    }
    static int binary_Search(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            // find middle element
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                // ans is found
                return mid;
            }else if(target > mid){
                start = mid+1;
            }else{
                end = mid-1;
            }

        }
        return -1;
    }
}
