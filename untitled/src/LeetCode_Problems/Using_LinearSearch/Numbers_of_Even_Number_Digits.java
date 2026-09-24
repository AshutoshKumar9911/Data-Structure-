//Leet Code Problem 1295
//Find the number of digit with even number of digit
//Given an array if nums of integer, return how many of them contain even number of digits

package LeetCode_Problems.Using_LinearSearch;

import java.util.Arrays;
public class Numbers_of_Even_Number_Digits {
    public static void main(String[] args) {
        int[]nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[]nums){
        int count = 0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    // function to check where a number contain an even number of digit
    static boolean even(int num){
        int numberofDigits = digit(num);
        return numberofDigits%2==0;
    }
    // count the number of digit in a number
    static int digit(int num) {
        if (num < 0) {
            num = num * (-1);
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
