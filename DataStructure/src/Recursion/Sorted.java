package Recursion;

public class Sorted {
    public static void main(String[] args) {
       int [] arr ={1,2,5,7,8,9};
        System.out.println(sorted_Array(arr,0));
    }
    static boolean sorted_Array(int[]arr, int index){
        // base conditon
        if(index == arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted_Array(arr,index+1);
    }
}
