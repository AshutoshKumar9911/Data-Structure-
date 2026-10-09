package Recursion;

public class Digit_Product {
    public static void main(String[] args) {
        int ans = produ  (1324);
        System.out.println(ans);
    }
    static int produ(int n){
        if (n%10 == n){
            return n;
        }
        return (n%10)*produ(n/10);
    }
}
