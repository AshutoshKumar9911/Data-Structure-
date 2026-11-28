package LeetCode_Problem_Using_BinarySearch;

public class Arrange_Coin_Binary_Approach {
    public static void main(String[] args) {

        System.out.println(arrangeCoins(5));

    }
    public static int arrangeCoins(int n){
        // binary search approach
        int low = 0;
        int high = n;
        int value = 0;
        while(low<=high){
            int m = low +(high-low)/2;
            long required = (long)m*(m+1)/2;
            if(required <= n){
                value = m;
                low = m+1;
            }else{
                high = m-1;
            }
        }
        return value;
    }
}
