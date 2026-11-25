package LeetCode_Problem_Using_BinarySearch;
import java.util.Arrays;

import com.sun.jdi.PathSearchingVirtualMachine;

public class FAIR_CANDY_SWAP {
    public static void main(String[] args) {
        int[] aliceSizes = {1, 1};
        int[] bobSizes = {2, 2};

        int[] result = fairCandySwap(aliceSizes, bobSizes);

        System.out.println(Arrays.toString(result));

    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int SumA = 0;// let SumA is total number of candies that alice have
        int SumB = 0; // let SumB is total number of candies that bob have
        for (int i = 0; i < aliceSizes.length; i++) {
            SumA += aliceSizes[i];
        }
        for (int i = 0; i < bobSizes.length; i++) {
            SumB += bobSizes[i];
        }
        int diff = (SumA - SumB) / 2;
        // important logic
        // let X be the candies exchange from alice
        // let Y is the candies exchange from bob
        // SumA-X+Y= SumB-Y+X
        // X-Y = (SumA - SumB)/2

        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                if (aliceSizes[i] - bobSizes[j] == diff) {
                    return new int[]{aliceSizes[i], bobSizes[j]};
                }
            }
        }
        return new int[]{};
    }
}
