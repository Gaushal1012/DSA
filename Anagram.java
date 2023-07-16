import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String s = sc.next();

            if (s.length() % 2 != 0) {
                System.out.println(-1);
            }

            if (s.length() % 2 == 0) {
                String str1 = s.substring(0, s.length() / 2);
                String str2 = s.substring(s.length() / 2);
                int count = 0;

                for (int j = 0; j < str2.length(); j++) {
                    if (!str1.contains(String.valueOf(str2.charAt(j)))) {
                        count++;
                    }
                }

                System.out.println(count);
                // System.out.println(str1);
                // System.out.println(str2);
            }
        }
    }
}
