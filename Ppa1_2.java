

import java.util.*;

public class Ppa1_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        evenDisplay(s1);
        sc.close();
    }

    // Define evenDisplay(String) method here
    public static void evenDisplay(String s) {
        for (int i = 0; i <= s.length(); i += 2) {
            System.out.print(s.charAt(i));
        }
    }
}