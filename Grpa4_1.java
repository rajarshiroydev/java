import java.util.*;

abstract class StringOperations {
    public abstract String reverse(String s);

    public abstract int vowelCount(String s);
}

// Fill the code here
class UpdatedStrings extends StringOperations {

    @Override
    public String reverse(String s) {
        StringBuffer sb = new StringBuffer(); //StringBugger is used to create a mutable string.
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    @Override
    public int vowelCount(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' ||
                    s.charAt(i) == 'e' ||
                    s.charAt(i) == 'i' ||
                    s.charAt(i) == 'o' ||
                    s.charAt(i) == 'u') {
                count += 1;
            }
        }
        return count;
    }

}

public class Grpa4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        UpdatedStrings str = new UpdatedStrings();
        System.out.println("Reverse of " + s + " is " + str.reverse(s));
        System.out.println("Vowel count of " + s + " is " + str.vowelCount(s));
        sc.close();
    }
}