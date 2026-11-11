package String_Java;
import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        // output of above code is 195
        // This is because In Java, 'a' and 'b' are char values. and Each character has a numeric Unicode value:
        // When you use + between two char values, Java performs numeric addition
        // When you use + between two char values, Java performs numeric addition

        System.out.println("a"+"b");
        // This give output ab this is because "a" and "b" are string
        // so + perform string concatenation
        System.out.println((char)('a'+3));
        System.out.println("a"+1);
        // when an integer is concatenated with a string it is converted to
        // integer will be converted to Integer that will call toString()
        // this is same as after a few steps: "a"+"1"

        System.out.println("Ashutosh" + new ArrayList<>());
        System.out.println("Ashutosh" + new Integer(905 ));

       // System.out.println(new Integer(905) + new ArrayList<>());

        // This will give an error because + in java you can only use with
        // primitive and when one value is string
        // atleast one object should of string type
    }
}
