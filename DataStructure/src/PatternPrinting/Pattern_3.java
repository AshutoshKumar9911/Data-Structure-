package PatternPrinting;

// Pattern_3
//   * * * * *
//   * * * *
//   * * *
//   * *
//   *

public class Pattern_3 {
    public static void main(String[] args) {
        Pattern_Three(5);
    }
    static void Pattern_Three(int n){
        for(int row = 1; row<=n;row++){
            // for every row run the column
            for(int col = 1; col<=n-row+1;col++){
                System.out.print("* ");
            }
            // when one new row is printed we need to add a new line
            System.out.println();
        }
    }
}
