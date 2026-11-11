// LeetCode Problem 1672
// Richest Customer Wealth



package LeetCode_Problems.Using_LinearSearch;

public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        int[][] accounts =  {
                {1,2,3},
                {4,5,6}
        };
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][]accounts){
        int max_Value = 0;
        // person = row
        // account = column

        for(int person = 0; person < accounts.length; person++){
            // when you start a new row, take a new sum of that row
            int sum = 0;
            for(int account = 0; account < accounts[person].length;account++) {
                sum += accounts[person][account];
                // now we have the sum  of account of the person
                // check overall ans
                if (max_Value < sum) {
                    max_Value = sum;
                }

            }
        }
        return max_Value;
     }
}
