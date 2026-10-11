package Recursion;

public class findIndex {
    public static void main(String[] args) {
       int [] arr = {10,3,6,12,34,13,4};
      // int target = 12;
        System.out.println(findIndexValue(arr,12,0));
    }
    static boolean find(int[] arr,int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr,target,index+1);
    }

    static int findIndexValue(int[]arr,int target,int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return findIndexValue(arr,target,index+1);
        }
    }
}
