package LeetCodeProblemUsingString;

public class Defanged_Ip_Address {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        System.out.println(defanged_Ip_Address(address));
    }
    static String defanged_Ip_Address(String address){
        address = address.replace(".","[.]");
        return address;
    }
}
