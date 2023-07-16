import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PalindromeIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            String str = "";
            String a = "";
            int index = -1;
            if (s.length() % 2 == 0) {
                str = s.substring(s.length() / 2);
                for (int j = str.length() - 1; j >= 0; j--) {
                    a = a + str.charAt(j);
                }
            }
            if (s.length() % 2 != 0) {
                str = s.substring(s.length() / 2 + 1);
                for (int j = str.length() - 1; j >= 0; j--) {
                    a = a + str.charAt(j);
                }
            }

            for (int j = 0; j < str.length(); j++) {
                if (s.charAt(j) != a.charAt(j)) {
                    index = j;
                    // for (int j2 = 0; j2 < s.length(); j2++) {
                    // if (a.charAt(index) == s.charAt(j2)) {
                    // index = j2;
                    // }
                    // }
                }
            }

            System.out.println(index);
            // System.out.println(str);
            // System.out.println(a);
        }
    }
}
