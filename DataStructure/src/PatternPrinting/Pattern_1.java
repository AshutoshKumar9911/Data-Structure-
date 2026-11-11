package PatternPrinting;
// Pattern1
//  * * * * *
//  * * * * *
//  * * * * *
//  * * * * *
//  * * * * *
public class Pattern_1 {
    public static void main(String[] args) {
        Pattern_One(5);
    }
    static void Pattern_One(int n){
        for(int row = 1; row<=n;row++){
            // for every row run the column
            for(int col = 1; col<=n;col++){
                System.out.print("* ");
            }
            // when one new row is printed we need to add a new line
            System.out.println();
        }
    }

}
