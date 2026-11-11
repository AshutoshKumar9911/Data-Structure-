// Leet code problem number 1662
// Check if two string arrays are equivalent

package LeetCodeProblemUsingString;
import java.util.Arrays;

public class StringArraysAreEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab","c"};
        String[] word2 = {"a","bc"};

        System.out.println(arrayStringAreEqual(word1,word2));
    }
    static boolean arrayStringAreEqual(String[] word1,String[] word2){
        String str1 ="";
        String str2 ="";

        for(int i=0; i< word1.length;i++){
            str1 = str1 + word1[i];
        }
        for(int i=0; i < word2.length;i++){
            str2 = str2 + word2[i];
        }
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }
}
