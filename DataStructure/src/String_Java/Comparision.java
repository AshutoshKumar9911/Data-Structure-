package String_Java;

public class Comparision {
    public static void main(String[] args) {
        String name = "Ashutosh Kumar";
        String b = "Ashutosh Kumar";
        String c = b;

        // == return true only if  reference variable points to same object
        System.out.println(c==b);
        System.out.println(name == b);
         // How to create different object of same value

        String name1 = new String("Isha Tiwari");
        String name2 = new String("Isha Tiwari");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.charAt(0));
    }
}
