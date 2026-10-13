package Recursion;

//Given an integer num, return the number of steps to reduce it to zero.

//In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

public class  Count_Steps {
    public static void main(String[] args) {

    }
    public int numberOfSteps(int num){
        return helper(num,0);
    }

    private int helper(int num, int step){
        if(num == 0){
            return step;
        }
        if (num%2 == 0){
            return helper(num/2,step+1);
        }
        return helper(num-1,step+1);
    }
}
