package Recursion;

import java.util.ArrayList;

public class findIndex {
    public static void main(String[] args) {
       //int [] arr = {10,3,6,12,34,13,4};
       int [] arr = {1,1,1,2,4,5,7,9,};
      // int target = 12;
        //findAllIndex(arr,1,0);
        //System.out.println(list);

//        ArrayList<Integer> ans = findAllIndex(arr,1,0,new ArrayList<>());
//        System.out.println(ans);

        System.out.println(findAllIndex2(arr,1,0));
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
    // how we create array list
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[]arr,int target,int index){
        if(index == arr.length){
            return;
        }
        if (arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }

    static ArrayList<Integer> findAllIndex(int []arr,int target, int index, ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }
        if(arr[index]== target){
            list.add(index);
        }
        return findAllIndex(arr,target,index + 1,list);
    }
    static ArrayList<Integer> findAllIndex2(int []arr,int target, int index){
        ArrayList<Integer> list2 = new ArrayList<>();
        if (index == arr.length){
            return list2;
        }

        // this will contain answer for that function call only
        if(arr[index]== target){
            list2.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr,target,index + 1);
        list2.addAll(ansFromBelowCalls);
        return list2;
    }
}
