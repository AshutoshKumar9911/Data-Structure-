package PatternPrinting;
//Pattern_2
//  *
//  * *
//  * * *
//  * * * *
//  * * * * *
public class Pattern_2 {
    public static void main(String[] args) {
        Pattern_Two(5);

    }static void Pattern_Two(int n){
        for(int row = 1; row<=n;row++){
            // for every row run the column
            for(int col = 1; col<=row;col++){
                System.out.print("* ");
            }
            // when one new row is printed we need to add a new line
            System.out.println();
        }
    }
}
