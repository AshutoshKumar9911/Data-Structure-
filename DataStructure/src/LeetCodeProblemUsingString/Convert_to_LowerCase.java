// Leet Code Problem  709
// To Lower Case ASHUTOSH -> ashutosh kumar

package LeetCodeProblemUsingString;

public class Convert_to_LowerCase {
    public static void main(String[] args) {
        System.out.println(ToLowerCase("ASHUTOSH"));
    }
    static String ToLowerCase(String s){
        char[] ch = new char[s.length()];
        for(int i =0;i<s.length();i++){
            char current = s.charAt(i);
            if(s.charAt(i)>='A'&& s.charAt(i)<='Z'){
                current=(char)(current+32);
                ch[i]= current;
            }
            ch[i] =current;
        }
        return new String(ch);
    }
}
